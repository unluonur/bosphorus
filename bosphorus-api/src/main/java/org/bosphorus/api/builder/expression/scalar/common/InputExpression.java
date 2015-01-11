package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.factory.IScalarExecutorFactory1;
import org.bosphorus.expression.scalar.factory.common.InputExecutorFactory;

public class InputExpression<TInput> implements IScalarExpression1<TInput, TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutorFactory1<TInput, TInput> build() {
		return new InputExecutorFactory<TInput>();
	}

}
