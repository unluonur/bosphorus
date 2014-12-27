package org.bosphorus.api.fluent.expression.scalar.type.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public class IntegerExpression<TInput> extends BaseComparableExpression<TInput, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerExpression(IScalarExpression<TInput, Integer> builder) {
		super(builder);
	}

}
