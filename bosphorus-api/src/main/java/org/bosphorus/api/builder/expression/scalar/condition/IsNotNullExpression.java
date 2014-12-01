package org.bosphorus.api.builder.expression.scalar.condition;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.IsNotNullExecutor;

public class IsNotNullExpression<TInput> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IScalarExpression<TInput, ?> value;

	public IsNotNullExpression(IScalarExpression<TInput, ?> value) {
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
		return new IsNotNullExecutor<TInput>(getValue().build());
	}

}
