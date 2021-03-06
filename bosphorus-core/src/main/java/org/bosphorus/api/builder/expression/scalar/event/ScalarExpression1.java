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


package org.bosphorus.api.builder.expression.scalar.event;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.event.ExpressionExecutorFactory1;

public class ScalarExpression1<TInput, TOutput, TType> implements IScalarExpression1<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<? super TType, ? extends TOutput> expression;
	private IScalarExpression1<? super TInput, ? extends TType> parameter;
	
	public ScalarExpression1(IScalarExpression1<? super TType, ? extends TOutput> expression, IScalarExpression1<? super TInput, ? extends TType> parameter) {
		setExpression(expression);
		setParameter(parameter);
	}

	public IScalarExpression1<? super TType, ? extends TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExpression1<? super TType, ? extends TOutput> expression) {
		this.expression = expression;
	}

	public IScalarExpression1<? super TInput, ? extends TType> getParameter() {
		return parameter;
	}

	public void setParameter(IScalarExpression1<? super TInput, ? extends TType> parameter) {
		this.parameter = parameter;
	}

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new ExpressionExecutorFactory1<TInput, TOutput, TType>(getExpression().build(), getParameter().build());
	}

}
