package org.bosphorus.api.fluent.expression.scalar.type.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public class LongExpression<TInput> extends BaseComparableExpression<TInput, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LongExpression(IScalarExpression<TInput, Long> builder) {
		super(builder);
	}

}
