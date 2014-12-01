package org.bosphorus.api.fluent.expression.scalar.type.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public abstract class BaseNumberExpression<TInput, TOutput extends Number & Comparable<TOutput>> extends BasePrimitiveExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseNumberExpression(IScalarExpression<TInput, TOutput> builder) {
		super(builder);
	}

}
