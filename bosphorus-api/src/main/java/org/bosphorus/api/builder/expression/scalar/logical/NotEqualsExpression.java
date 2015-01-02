package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.NotEquals;

public class NotEqualsExpression<TInput, TType extends Comparable<TType>> extends BaseComparisonExpression<TInput, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotEqualsExpression(IScalarExpression<TInput, TType> left,
			IScalarExpression<TInput, TType> right) {
		super(left, right);
	}

	@Override
	public IScalarExecutor<TInput, Boolean> build() {
		return new NotEquals<TInput, TType>(getLeft().build(), getRight().build());
	}

}
