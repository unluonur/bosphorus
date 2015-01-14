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


package org.bosphorus.api.builder.expression.scalar.event;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression3;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.event.ExpressionExecutorFactory3;

public class ScalarExpression3<TInput, TOutput, TType1, TType2, TType3> implements IScalarExpression1<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression3<TType1, TType2, TType3, TOutput> expression;
	private IScalarExpression1<TInput, TType1> parameter1;
	private IScalarExpression1<TInput, TType2> parameter2;
	private IScalarExpression1<TInput, TType3> parameter3;
	
	public ScalarExpression3(IScalarExpression3<TType1, TType2, TType3, TOutput> expression, IScalarExpression1<TInput, TType1> parameter1, IScalarExpression1<TInput, TType2> parameter2, IScalarExpression1<TInput, TType3> parameter3) {
		setExpression(expression);
		setParameter1(parameter1);
		setParameter2(parameter2);
		setParameter3(parameter3);
	}

	public IScalarExpression3<TType1, TType2, TType3, TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExpression3<TType1, TType2, TType3, TOutput> expression) {
		this.expression = expression;
	}

	public IScalarExpression1<TInput, TType1> getParameter1() {
		return parameter1;
	}

	public void setParameter1(IScalarExpression1<TInput, TType1> parameter1) {
		this.parameter1 = parameter1;
	}

	public IScalarExpression1<TInput, TType2> getParameter2() {
		return parameter2;
	}

	public void setParameter2(IScalarExpression1<TInput, TType2> parameter2) {
		this.parameter2 = parameter2;
	}

	public IScalarExpression1<TInput, TType3> getParameter3() {
		return parameter3;
	}

	public void setParameter3(IScalarExpression1<TInput, TType3> parameter3) {
		this.parameter3 = parameter3;
	}

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new ExpressionExecutorFactory3<TInput, TOutput, TType1, TType2, TType3>(getExpression().build(), getParameter1().build(), getParameter2().build(), getParameter3().build());
	}

}
