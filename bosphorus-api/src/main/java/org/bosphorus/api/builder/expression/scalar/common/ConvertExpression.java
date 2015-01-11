package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.expression.scalar.factory.common.ConvertExecutorFactory;

public class ConvertExpression<TInput, TOutput> implements IScalarExpression1<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutorFactory1<TInput, TOutput> build() {
		return new ConvertExecutorFactory<TInput, TOutput>();
	}

}
