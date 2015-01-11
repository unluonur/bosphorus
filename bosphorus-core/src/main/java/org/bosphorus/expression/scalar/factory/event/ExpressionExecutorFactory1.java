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
import org.bosphorus.expression.scalar.executor.event.ExpressionExecutor1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;

public class ExpressionExecutorFactory1<TInput, TOutput, TType> implements IScalarExecutorFactory1<TInput, TOutput> {
	private IScalarExecutorFactory1<TType, TOutput> executor;
	private IScalarExecutorFactory1<TInput, TType> parameter;

	public ExpressionExecutorFactory1(IScalarExecutorFactory1<TType, TOutput> executor, IScalarExecutorFactory1<TInput, TType> parameter) {
		this.executor = executor;
		this.parameter = parameter;
	}

	@Override
	public IScalarExecutor1<TInput, TOutput> create() {
		return new ExpressionExecutor1<TInput, TOutput, TType>(executor.create(), parameter.create());
	}
}
