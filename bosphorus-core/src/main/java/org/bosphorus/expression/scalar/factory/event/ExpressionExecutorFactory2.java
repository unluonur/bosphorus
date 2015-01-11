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


package org.bosphorus.expression.scalar.factory.event;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.event.ExpressionExecutor2;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory2;

public class ExpressionExecutorFactory2<TInput, TOutput, TType1, TType2> implements IScalarExecutorFactory1<TInput, TOutput> {
	private IScalarExecutorFactory2<? super TType1, TType2, ? extends TOutput> executor;
	private IScalarExecutorFactory1<? super TInput, ? extends TType1> parameter1;
	private IScalarExecutorFactory1<? super TInput, ? extends TType2> parameter2;

	public ExpressionExecutorFactory2(
			IScalarExecutorFactory2<? super TType1, TType2, ? extends TOutput> executor, 
			IScalarExecutorFactory1<? super TInput, ? extends TType1> parameter1, 
			IScalarExecutorFactory1<? super TInput, ? extends TType2> parameter2) {
		this.executor = executor;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
	}
	
	@Override
	public IScalarExecutor1<TInput, TOutput> create() {
		return new ExpressionExecutor2<TInput, TOutput, TType1, TType2>(executor.create(), parameter1.create(), parameter2.create());
	}
}
