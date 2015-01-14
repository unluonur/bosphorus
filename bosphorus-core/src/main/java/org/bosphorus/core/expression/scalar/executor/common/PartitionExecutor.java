/**
 * Copyright (c) Onur Ünlü
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


package org.bosphorus.core.expression.scalar.executor.common;

import java.util.HashMap;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

public class PartitionExecutor<TInput, TOutput, TPartitionKey> implements IScalarExecutor1<TInput, TOutput> {
	private IScalarExecutor1<? super TInput, ? extends TPartitionKey> keyExpression;
	private IScalarExecutorFactory1<? super TInput, ? extends TOutput> valueFactory;
	protected HashMap<TPartitionKey, IScalarExecutor1<? super TInput, ? extends TOutput>> map;

	public PartitionExecutor(IScalarExecutor1<? super TInput, ? extends TPartitionKey> keyExpression, 
			IScalarExecutorFactory1<? super TInput, ? extends TOutput> valueFactory) {
		this.keyExpression = keyExpression;
		this.valueFactory = valueFactory;
		this.map = new HashMap<TPartitionKey, IScalarExecutor1<? super TInput,? extends TOutput>>();
	}
	
	@Override
	public TOutput execute(TInput input) throws Exception {
		TPartitionKey key = keyExpression.execute(input);
		IScalarExecutor1<? super TInput, ? extends TOutput> executor;
		if(map.containsKey(key)) {
			executor = map.get(key);
		}
		else {
			executor = valueFactory.create();
			map.put(key, executor);
		}
		return executor.execute(input);
	}
	
	@Override
	public void reset() {
		map.clear();
	}

	@Override
	public Object getState() {
		HashMap<TPartitionKey, Object> state = new HashMap<TPartitionKey, Object>();
		for(TPartitionKey key: this.map.keySet()) {
			state.put(key, this.map.get(key).getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		HashMap<TPartitionKey, Object> stateMap = (HashMap<TPartitionKey, Object>)state;
		for(TPartitionKey key: stateMap.keySet()) {
			IScalarExecutor1<? super TInput, ? extends TOutput> value = valueFactory.create();
			value.setState(stateMap.get(key));
			map.put(key, value);
		}
	}

}
