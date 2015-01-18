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

package org.bosphorus.core.expression.aggregate.executor.event;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.aggregate.executor.IAggregateExecutor;

public class AggregationListExecutor<TInput, TOutput> implements IAggregateExecutor<TInput, List<TOutput>> {
	private List<? extends IAggregateExecutor<? super TInput, ? extends TOutput>> list;
	
	public AggregationListExecutor(List<? extends IAggregateExecutor<? super TInput, ? extends TOutput>> list) {
		this.list = list;
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IAggregateExecutor<? super TInput, ? extends TOutput> bag: list) {
			bag.execute(input);
		}
	}

	@Override
	public List<TOutput> getValue() {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IAggregateExecutor<? super TInput, ? extends TOutput> bag: list) {
			result.add(bag.getValue());
		}
		return result;
	}

	@Override
	public void reset() {
		for(IAggregateExecutor<? super TInput, ? extends TOutput> bag: list) {
			bag.reset();
		}
	}

	@Override
	public Object getState() {
		ArrayList<Object> state = new ArrayList<Object>();
		for(IAggregateExecutor<? super TInput, ? extends TOutput> executor: this.list) {
			state.add(executor.getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		ArrayList<Object> stateList = (ArrayList<Object>)state;
		for(Integer i=0; i<this.list.size(); i++) {
			this.list.get(i).setState(stateList.get(i));
		}
	}

}
