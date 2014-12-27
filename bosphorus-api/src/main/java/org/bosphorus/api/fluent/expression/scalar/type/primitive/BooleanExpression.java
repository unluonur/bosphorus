package org.bosphorus.api.fluent.expression.scalar.type.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public class BooleanExpression<TInput> extends BaseComparableExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BooleanExpression(IScalarExpression<TInput, Boolean> builder) {
		super(builder);
	}

}
