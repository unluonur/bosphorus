package org.bosphorus.api.expression.scalar.common;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.ConvertExecutor;

public class ConvertExpression<TInput, TOutput, TSource> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, TSource> expression;
	
	public ConvertExpression(IScalarExpression<TInput, TSource> expression) {
		this.setExpression(expression);
	}

	public IScalarExpression<TInput, TSource> getExpression() {
		return expression;
	}

	public void setExpression(IScalarExpression<TInput, TSource> expression) {
		this.expression = expression;
	}

	@Override
	public IScalarExecutor<TInput, TOutput> build() {
		return new ConvertExecutor<TInput, TOutput, TSource>(getExpression().build());
	}

}
