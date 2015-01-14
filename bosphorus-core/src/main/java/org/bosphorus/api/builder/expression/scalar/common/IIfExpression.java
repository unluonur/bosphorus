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


package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.core.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.core.expression.scalar.factory.common.IIfExecutorFactory;

public class IIfExpression<TInput, TOutput> implements IScalarExpression1<TInput, TOutput> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression1<TInput, Boolean> condition;
	private IScalarExpression1<TInput, TOutput> trueExpression;
	private IScalarExpression1<TInput, TOutput> falseExpression;
	
	public IIfExpression(
			IScalarExpression1<TInput, Boolean> condition, 
			IScalarExpression1<TInput, TOutput> trueExpression, 
			IScalarExpression1<TInput, TOutput> falseExpression) {
		setCondition(condition);
		setTrueExpression(trueExpression);
		setFalseExpression(falseExpression);
	}
	
	public IScalarExpression1<TInput, Boolean> getCondition() {
		return condition;
	}
	
	public void setCondition(IScalarExpression1<TInput, Boolean> condition) {
		this.condition = condition;
	}
	
	public IScalarExpression1<TInput, TOutput> getTrueExpression() {
		return trueExpression;
	}
	
	public void setTrueExpression(IScalarExpression1<TInput, TOutput> trueExpression) {
		this.trueExpression = trueExpression;
	}
	
	public IScalarExpression1<TInput, TOutput> getFalseExpression() {
		return falseExpression;
	}
	
	public void setFalseExpression(IScalarExpression1<TInput, TOutput> falseExpression) {
		this.falseExpression = falseExpression;
	}

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new IIfExecutorFactory<TInput, TOutput>(getCondition().build(), getTrueExpression().build(), getFalseExpression().build());
	}
	
}
