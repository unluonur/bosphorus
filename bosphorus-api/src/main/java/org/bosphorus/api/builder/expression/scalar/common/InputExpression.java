package org.bosphorus.api.builder.expression.scalar.common;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.common.TupleExecutor;

public class InputExpression<TInput> implements IScalarExpression<TInput, TInput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IScalarExecutor<TInput, TInput> build() {
		return new TupleExecutor<TInput>();
	}

}
