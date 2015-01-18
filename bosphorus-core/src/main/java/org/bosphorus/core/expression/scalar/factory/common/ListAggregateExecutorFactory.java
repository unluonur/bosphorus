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


package org.bosphorus.core.expression.scalar.factory.common;

import java.util.List;

import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.expression.scalar.executor.common.ListAggregateExecutor;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

public class ListAggregateExecutorFactory<TInput, TType, TOutput> implements IScalarExecutorFactory1<TInput, TOutput> {
	private IScalarExecutorFactory1<? super TInput, ? extends List<? extends TType>> listExpression;
	private IAggregateExecutorFactory<? super TType, ? extends TOutput> factory;
	
	public ListAggregateExecutorFactory(IScalarExecutorFactory1<? super TInput, ? extends List<? extends TType>> listExpression, 
			IAggregateExecutorFactory<? super TType, ? extends TOutput> factory) {
		this.listExpression = listExpression;
		this.factory = factory;
	}
	
	@Override
	public IScalarExecutor1<TInput, TOutput> create() {
		return new ListAggregateExecutor<TInput, TType, TOutput>(listExpression.create(), factory);
	}

}
