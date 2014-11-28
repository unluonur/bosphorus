package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class FloatExpression<TInput> extends BaseNumberExpression<TInput, Float> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FloatExpression(IScalarExpression<TInput, Float> builder) {
		super(builder);
	}

}
