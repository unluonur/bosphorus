package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class IntegerExpression<TInput> extends BaseNumberExpression<TInput, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IntegerExpression(IScalarExpression<TInput, Integer> builder) {
		super(builder);
	}

}
