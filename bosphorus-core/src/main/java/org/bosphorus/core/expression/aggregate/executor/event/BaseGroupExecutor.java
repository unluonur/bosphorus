/**
 * Copyright (c) Onur �nl�
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The latest version of this file can be found at https://github.com/unluonur/bosphorus
 */


package org.bosphorus.core.expression.aggregate.executor.event;

import java.util.HashMap;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;

public abstract class BaseGroupExecutor<TInput, TOutput, TKey, TValue> implements IAggregateExecutor<TInput, TOutput> {
	private IScalarExecutor1<? super TInput, ? extends TKey> keyExpression;
	private IAggregateExecutorFactory<? super TInput, ? extends TValue> valueFactory;
	protected HashMap<TKey, IAggregateExecutor<? super TInput, ? extends TValue>> map;
	
	public BaseGroupExecutor(IScalarExecutor1<? super TInput, ? extends TKey> keyExpression, 
			IAggregateExecutorFactory<? super TInput, ? extends TValue> valueExpression) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueExpression;
		this.map = new HashMap<TKey, IAggregateExecutor<? super TInput,? extends TValue>>();
	}

	@Override
	public void execute(TInput input) throws Exception {
		if(input != null) {
			TKey key = keyExpression.execute(input);
			IAggregateExecutor<? super TInput, ? extends TValue> value;
			if(map.containsKey(key)) {
				value = map.get(key);
			}
			else {
				value = valueFactory.create();
				map.put(key,  value);
			}
			value.execute(input);
		}
	}

	@Override
	public void reset() {
		map.clear();
	}

	@Override
	public Object getState() {
		HashMap<TKey, Object> state = new HashMap<TKey, Object>();
		for(TKey key: this.map.keySet()) {
			state.put(key, this.map.get(key).getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		HashMap<TKey, Object> stateMap = (HashMap<TKey, Object>)state;
		for(TKey key: stateMap.keySet()) {
			IAggregateExecutor<? super TInput, ? extends TValue> value = valueFactory.create();
			value.setState(stateMap.get(key));
			map.put(key, value);
		}
	}

}
