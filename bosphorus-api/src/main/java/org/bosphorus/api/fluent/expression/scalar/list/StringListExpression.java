package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.primitive.StringExpression;

public class StringListExpression<TInput> extends BasePrimitiveListExpression<TInput, String, StringExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StringListExpression(
			IScalarExpression<TInput, List<String>> builder) {
		super(builder);
	}
	
	public StringExpression<TInput> join(IScalarExpression<TInput, String> delimeter) {
		return null;
	}

	@Override
	protected StringExpression<TInput> create(
			IScalarExpression<TInput, String> expression) {
		return new StringExpression<TInput>(expression);
	}

}
