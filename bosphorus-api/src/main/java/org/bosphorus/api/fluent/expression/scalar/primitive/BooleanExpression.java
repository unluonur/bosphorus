package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;

public class BooleanExpression<TInput> extends BaseComparableExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BooleanExpression(IScalarExpression1<TInput, Boolean> builder) {
		super(builder);
	}

}
