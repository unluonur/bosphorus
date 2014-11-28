package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class BooleanExpression<TInput> extends BasePrimitiveExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BooleanExpression(IScalarExpression<TInput, Boolean> builder) {
		super(builder);
	}

}
