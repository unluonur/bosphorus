package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.expression.scalar.executor.IScalarExecutor1;
import org.bosphorus.expression.scalar.executor.common.InputExecutor;

public class InputExpression<TInput> implements IScalarExpression1<TInput, TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutor1<TInput, TInput> build() {
		return new InputExecutor<TInput>();
	}

}
