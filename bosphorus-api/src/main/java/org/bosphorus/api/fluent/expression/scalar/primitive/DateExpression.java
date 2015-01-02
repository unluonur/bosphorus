package org.bosphorus.api.fluent.expression.scalar.primitive;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToDayExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToMonthExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToWeekExpression;

public class DateExpression<TInput> extends BaseComparableExpression<TInput, Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateExpression(IScalarExpression<TInput, Date> builder) {
		super(builder);
	}
	
	public DateExpression<TInput> truncateToDay() {
		return new DateExpression<TInput>(new TruncateToDayExpression<TInput>(this));
	}
	
	public DateExpression<TInput> truncateToWeek() {
		return new DateExpression<TInput>(new TruncateToWeekExpression<TInput>(this));
	}
	
	public DateExpression<TInput> truncateToMonth() {
		return new DateExpression<TInput>(new TruncateToMonthExpression<TInput>(this));
	}

}
