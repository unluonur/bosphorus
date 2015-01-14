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


package org.bosphorus.core.expression.scalar.factory.event;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.core.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.core.expression.scalar.executor.event.ExpressionListExecutor;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;

public class ExpressionListExecutorFactory<TInput, TType> implements IScalarExecutorFactory1<TInput, List<TType>> {

	private List<? extends IScalarExecutorFactory1<? super TInput, ? extends TType>> expressions;

	public ExpressionListExecutorFactory(List<? extends IScalarExecutorFactory1<? super TInput, ? extends TType>> expressions) {
		this.expressions = expressions;
	}

	@Override
	public IScalarExecutor1<TInput, List<TType>> create() {
		ArrayList<IScalarExecutor1<? super TInput, ? extends TType>> list = new ArrayList<IScalarExecutor1<? super TInput,? extends TType>>();
		for(IScalarExecutorFactory1<? super TInput, ? extends TType> expr: expressions) {
			list.add(expr.create());
		}
		return new ExpressionListExecutor<TInput, TType>(list);
	}


}
