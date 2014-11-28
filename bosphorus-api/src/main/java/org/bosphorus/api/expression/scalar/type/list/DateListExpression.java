package org.bosphorus.api.expression.scalar.type.list;

import java.util.Date;
import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DateExpression;

public class DateListExpression<TInput> extends BaseListExpression<TInput, Date, DateExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateListExpression(
			IScalarExpression<TInput, List<Date>> builder) {
		super(builder);
	}

	@Override
	protected DateExpression<TInput> create(
			IScalarExpression<TInput, Date> expression) {
		return new DateExpression<TInput>(expression);
	}

}
