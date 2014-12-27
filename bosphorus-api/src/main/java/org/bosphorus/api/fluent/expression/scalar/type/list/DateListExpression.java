package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.Date;
import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.common.MaxExpression;
import org.bosphorus.api.builder.expression.aggregate.common.MinExpression;
import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.DateExpression;

public class DateListExpression<TInput> extends BasePrimitiveListExpression<TInput, Date, DateExpression<TInput>> {

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
	
	public DateExpression<TInput> min() {
		return new DateExpression<TInput>(this.aggregate(new MinExpression<Date>()));
	}
	
	public DateExpression<TInput> max() {
		return new DateExpression<TInput>(this.aggregate(new MaxExpression<Date>()));
	}

}
