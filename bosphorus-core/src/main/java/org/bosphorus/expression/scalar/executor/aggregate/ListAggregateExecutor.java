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

package org.bosphorus.expression.scalar.executor.aggregate;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.BaseStatelessExecutor1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;

public class ListAggregateExecutor<TInput, TType, TOutput> extends BaseStatelessExecutor1<TInput, TOutput> {
	private IScalarExecutor1<? super TInput, ? extends List<? extends TType>> listExpression;
	private IAggregateExecutorFactory<? super TType, ? extends TOutput> factory;
	
	public ListAggregateExecutor(IScalarExecutor1<? super TInput, ? extends List<? extends TType>> listExpression, 
			IAggregateExecutorFactory<? super TType, ? extends TOutput> factory) {
		this.listExpression = listExpression;
		this.factory = factory;
	}

	@Override
	public TOutput execute(TInput input) throws Exception {
		IAggregateExecutor<? super TType, ? extends TOutput> executor = factory.create();
		for(TType item: listExpression.execute(input)) {
			executor.execute(item);
		}
		return executor.getValue();
	}

}
