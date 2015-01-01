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

package org.bosphorus.expression.aggregate.executor.common;

import java.util.HashMap;
import java.util.Map;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class GroupMergeExecutor<TKey, TInputValue, TOutputValue> implements IAggregateExecutor<Map<TKey, TInputValue>, Map<TKey, TOutputValue>> {
	private IAggregateExecutorFactory<? super TInputValue, ? extends TOutputValue> mergeExpressionFactory;
	private HashMap<TKey, IAggregateExecutor<? super TInputValue, ? extends TOutputValue>> map;
	
	public GroupMergeExecutor(IAggregateExecutorFactory<? super TInputValue, ? extends TOutputValue> mergeExpressionFactory) {
		this.mergeExpressionFactory = mergeExpressionFactory;
		this.map = new HashMap<TKey, IAggregateExecutor<? super TInputValue, ? extends TOutputValue>>();
	}

	@Override
	public void execute(Map<TKey, TInputValue> input) throws Exception {
		for(TKey key: input.keySet()) {
			IAggregateExecutor<? super TInputValue, ? extends TOutputValue> aggrExecutor;
			if(map.containsKey(key)) {
				aggrExecutor = map.get(key);
			}
			else {
				aggrExecutor = mergeExpressionFactory.create();
				map.put(key, aggrExecutor);
			}
			aggrExecutor.execute(input.get(key));
		}
	}

	@Override
	public Map<TKey, TOutputValue> getValue() {
		HashMap<TKey, TOutputValue> result = new HashMap<TKey, TOutputValue>();
		for(TKey key: map.keySet()) {
			result.put(key, map.get(key).getValue());
		}
		return result;
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
			IAggregateExecutor<? super TInputValue, ? extends TOutputValue> value = mergeExpressionFactory.create();
			value.setState(stateMap.get(key));
			map.put(key, value);
		}
	}

}
