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

package org.bosphorus.expression.aggregate.factory.scalar;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.scalar.ListExpressionExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;

public class ListExpressionFactory<TInput, TType, TOutput> implements IAggregateExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor1<? super TInput, ? extends List<? extends TType>> expression;
	private IAggregateExecutorFactory<? super TType, ? extends TOutput> factory;
	
	public ListExpressionFactory(IScalarExecutor1<? super TInput, ? extends List<? extends TType>> expression, 
			IAggregateExecutorFactory<? super TType, ? extends TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IAggregateExecutor<TInput, TOutput> create() {
		return new ListExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
