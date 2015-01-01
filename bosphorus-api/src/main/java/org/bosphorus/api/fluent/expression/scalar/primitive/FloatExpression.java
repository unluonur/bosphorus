package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public class FloatExpression<TInput> extends BaseComparableExpression<TInput, Float> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FloatExpression(IScalarExpression<TInput, Float> builder) {
		super(builder);
	}

}
