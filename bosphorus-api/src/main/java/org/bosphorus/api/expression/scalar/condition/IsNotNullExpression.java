package org.bosphorus.api.expression.scalar.condition;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.IsNotNullExecutor;

public class IsNotNullExpression<TInput, TType> extends BaseUnaryConditionExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IsNotNullExpression(IScalarExpression<TInput, TType> value) {
		super(value);
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new IsNotNullExecutor<TInput, TType>(getValue().build());
	}

}
