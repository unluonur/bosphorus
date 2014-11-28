package org.bosphorus.api.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.primitive.StringExpression;

public class StringListExpression<TInput> extends BaseListExpression<TInput, String, StringExpression<TInput>> {

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
