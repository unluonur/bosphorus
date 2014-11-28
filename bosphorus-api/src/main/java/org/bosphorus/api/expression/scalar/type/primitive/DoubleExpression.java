package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class DoubleExpression<TInput> extends BaseNumberExpression<TInput, Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoubleExpression(IScalarExpression<TInput, Double> builder) {
		super(builder);
	}

}
