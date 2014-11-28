package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class LongExpression<TInput> extends BaseNumberExpression<TInput, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LongExpression(IScalarExpression<TInput, Long> builder) {
		super(builder);
	}

}
