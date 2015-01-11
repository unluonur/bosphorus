package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.common.ConvertExecutor;

public class ConvertExpression<TInput, TOutput> implements IScalarExpression1<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutor1<TInput, TOutput> build() {
		return new ConvertExecutor<TInput, TOutput>();
	}

}
