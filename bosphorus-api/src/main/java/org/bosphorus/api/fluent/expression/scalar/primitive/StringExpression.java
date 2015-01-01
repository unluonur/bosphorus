package org.bosphorus.api.fluent.expression.scalar.primitive;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.list.StringListExpression;

public class StringExpression<TInput> extends BaseComparableExpression<TInput, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringExpression(IScalarExpression<TInput, String> builder) {
		super(builder);
	}
	
	public StringListExpression<TInput> split(IScalarExpression<TInput, String> str) {
		return null;
	}

}
