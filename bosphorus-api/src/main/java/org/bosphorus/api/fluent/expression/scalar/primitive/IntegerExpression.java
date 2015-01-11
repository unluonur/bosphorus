package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;

public class IntegerExpression<TInput> extends BaseComparableExpression<TInput, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerExpression(IScalarExpression1<TInput, Integer> builder) {
		super(builder);
	}

}
