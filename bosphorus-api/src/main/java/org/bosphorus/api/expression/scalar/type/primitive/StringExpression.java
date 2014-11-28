package org.bosphorus.api.expression.scalar.type.primitive;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.list.StringListExpression;

public class StringExpression<TInput> extends BasePrimitiveExpression<TInput, String> {

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
