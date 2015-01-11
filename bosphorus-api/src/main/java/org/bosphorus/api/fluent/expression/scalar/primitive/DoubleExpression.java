package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;

public class DoubleExpression<TInput> extends BaseComparableExpression<TInput, Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoubleExpression(IScalarExpression1<TInput, Double> builder) {
		super(builder);
	}

}
