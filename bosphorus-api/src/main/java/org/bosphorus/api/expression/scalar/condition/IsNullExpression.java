package org.bosphorus.api.expression.scalar.condition;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.condition.IsNullExecutor;

public class IsNullExpression<TInput, TType> extends BaseUnaryConditionExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IsNullExpression(IScalarExpression<TInput, TType> value) {
		super(value);
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new IsNullExecutor<TInput, TType>(getValue().build());
	}

}
