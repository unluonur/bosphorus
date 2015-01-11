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


package org.bosphorus.expression.scalar.executor.event;

import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor3;

public class ExpressionExecutor3<TInput, TOutput, TType1, TType2, TType3> implements IScalarExecutor1<TInput, TOutput> {
	private IScalarExecutor3<? super TType1, ? super TType2, ? super TType3, ? extends TOutput> expressionExecutor;
	private IScalarExecutor1<? super TInput, ? extends TType1> parameterExecutor1;
	private IScalarExecutor1<? super TInput, ? extends TType2> parameterExecutor2;
	private IScalarExecutor1<? super TInput, ? extends TType3> parameterExecutor3;

	public ExpressionExecutor3(
			IScalarExecutor3<? super TType1, ? super TType2, ? super TType3, ? extends TOutput> expressionExecutor,
			IScalarExecutor1<? super TInput, ? extends TType1> parameterExecutor1,
			IScalarExecutor1<? super TInput, ? extends TType2> parameterExecutor2,
			IScalarExecutor1<? super TInput, ? extends TType3> parameterExecutor3
	) {
		this.expressionExecutor = expressionExecutor;
		this.parameterExecutor1 = parameterExecutor1;
		this.parameterExecutor2 = parameterExecutor2;
		this.parameterExecutor3 = parameterExecutor3;
	}
	
	@Override
	public TOutput execute(TInput input) throws Exception {
		return expressionExecutor.execute(parameterExecutor1.execute(input), parameterExecutor2.execute(input), parameterExecutor3.execute(input));
	}

}
