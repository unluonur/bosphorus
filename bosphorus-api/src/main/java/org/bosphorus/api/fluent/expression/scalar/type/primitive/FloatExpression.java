package org.bosphorus.api.fluent.expression.scalar.type.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public class FloatExpression<TInput> extends BaseNumberExpression<TInput, Float> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FloatExpression(IScalarExpression<TInput, Float> builder) {
		super(builder);
	}

}
