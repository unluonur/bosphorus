package org.bosphorus.api.expression.scalar.condition;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.condition.EqualsExecutor;

public class EqualsExpression<TInput, TType extends Comparable<TType>> extends BaseComparisonExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EqualsExpression(IScalarExpression<TInput, TType> left,
			IScalarExpression<TInput, TType> right) {
		super(left, right);
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new EqualsExecutor<TInput, TType>(getLeft().build(), getRight().build());
	}

}
