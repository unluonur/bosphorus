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

public class ExpressionExecutor1<TInput, TOutput, TType> implements IScalarExecutor1<TInput, TOutput> {
	private IScalarExecutor1<? super TType, ? extends TOutput> expressionExecutor;
	private IScalarExecutor1<? super TInput, ? extends TType> parameterExecutor;

	public ExpressionExecutor1(IScalarExecutor1<? super TType, ? extends TOutput> expressionExecutor, IScalarExecutor1<? super TInput, ? extends TType> parameterExecutor) {
		this.parameterExecutor = parameterExecutor;
		this.expressionExecutor = expressionExecutor;
	}
	
	@Override
	public TOutput execute(TInput input) throws Exception {
		return this.expressionExecutor.execute(this.parameterExecutor.execute(input));
	}

}
