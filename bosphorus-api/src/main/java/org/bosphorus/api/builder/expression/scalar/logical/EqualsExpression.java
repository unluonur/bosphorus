package org.bosphorus.api.builder.expression.scalar.logical;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.logical.EqualsExecutor;

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
