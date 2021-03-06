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


package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.event.IfNullExecutorFactory;

public class IfNullExpression<TInput, TOutput> implements IScalarExpression1<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, TOutput> expression;
	private IScalarExpression1<TInput, TOutput> defaultExpression;
	
	public IfNullExpression(IScalarExpression1<TInput, TOutput> expression, 
			IScalarExpression1<TInput, TOutput> defaultExpression) {
		setExpression(expression);
		setDefaultExpression(defaultExpression);
	}

	public IScalarExpression1<TInput, TOutput> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExpression1<TInput, TOutput> expression) {
		this.expression = expression;
	}

	public IScalarExpression1<TInput, TOutput> getDefaultExpression() {
		return defaultExpression;
	}

	public void setDefaultExpression(IScalarExpression1<TInput, TOutput> defaultExpression) {
		this.defaultExpression = defaultExpression;
	}

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new IfNullExecutorFactory<TInput, TOutput>(expression.build(), defaultExpression.build());
	}
}
