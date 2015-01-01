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

package org.bosphorus.expression.aggregate.factory.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.list.AggregationListExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class AggregationListFactory<TInput, TOutput> implements IAggregateExecutorFactory<TInput, List<TOutput>> {
	private List<IAggregateExecutorFactory<? super TInput, ? extends TOutput>> list;
	
	public AggregationListFactory(List<IAggregateExecutorFactory<? super TInput, ? extends TOutput>> list) {
		this.list = list;
	}

	@Override
	public IAggregateExecutor<TInput, List<TOutput>> create() {
		ArrayList<IAggregateExecutor<? super TInput, ? extends TOutput>> bags = new ArrayList<IAggregateExecutor<? super TInput, ? extends TOutput>>();
		for(IAggregateExecutorFactory<? super TInput, ? extends TOutput> factory: list) {
			bags.add(factory.create());
		}
		return new AggregationListExecutor<TInput, TOutput>(bags);
	}

}
