package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.IsNullExecutor;

public class IsNullExpression<TInput> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IScalarExpression<TInput, ?> value;

	public IsNullExpression(IScalarExpression<TInput, ?> value) {
		this.setValue(value);
	}

	public IScalarExpression<TInput, ?> getValue() {
		return value;
	}

	public void setValue(IScalarExpression<TInput, ?> value) {
		this.value = value;
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new IsNullExecutor<TInput>(getValue().build());
	}

}
