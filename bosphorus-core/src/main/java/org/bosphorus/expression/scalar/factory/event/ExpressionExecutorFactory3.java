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


package org.bosphorus.expression.scalar.factory.event;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.event.ExpressionExecutor3;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory3;

public class ExpressionExecutorFactory3<TInput, TOutput, TType1, TType2, TType3> implements IScalarExecutorFactory1<TInput, TOutput> {
	private IScalarExecutorFactory3<? super TType1, ? super TType2, ? super TType3, ? extends TOutput> executor;
	private IScalarExecutorFactory1<? super TInput, ? extends TType1> parameter1;
	private IScalarExecutorFactory1<? super TInput, ? extends TType2> parameter2;
	private IScalarExecutorFactory1<? super TInput, ? extends TType3> parameter3;

	public ExpressionExecutorFactory3(
			IScalarExecutorFactory3<? super TType1, ? super TType2, ? super TType3, ? extends TOutput> executor, 
			IScalarExecutorFactory1<? super TInput, ? extends TType1> parameter1, 
			IScalarExecutorFactory1<? super TInput, ? extends TType2> parameter2, 
			IScalarExecutorFactory1<? super TInput, ? extends TType3> parameter3) {
		this.executor = executor;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
	}
	
	@Override
	public IScalarExecutor1<TInput, TOutput> create() {
		return new ExpressionExecutor3<TInput, TOutput, TType1, TType2, TType3>(executor.create(), parameter1.create(), parameter2.create(), parameter3.create());
	}
}
