package org.bosphorus.api.expression.scalar.type.primitive;

import java.util.Date;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public class DateExpression<TInput> extends BasePrimitiveExpression<TInput, Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateExpression(IScalarExpression<TInput, Date> builder) {
		super(builder);
	}

}
