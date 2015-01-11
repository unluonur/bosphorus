package org.bosphorus.api.fluent.expression.scalar.primitive;

import java.util.Date;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToDayExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToMonthExpression;
import org.bosphorus.api.builder.expression.scalar.date.TruncateToWeekExpression;
import org.bosphorus.api.builder.expression.scalar.event.ScalarExpression1;

public class DateExpression<TInput> extends BaseComparableExpression<TInput, Date> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DateExpression(IScalarExpression1<TInput, Date> builder) {
		super(builder);
	}
	
	public DateExpression<TInput> truncateToDay() {
		return new DateExpression<TInput>(new ScalarExpression1<TInput, Date, Date>(new TruncateToDayExpression(), this.getBuilder()));
	}
	
	public DateExpression<TInput> truncateToWeek() {
		return new DateExpression<TInput>(new ScalarExpression1<TInput, Date, Date>(new TruncateToWeekExpression(), this.getBuilder()));
	}
	
	public DateExpression<TInput> truncateToMonth() {
		return new DateExpression<TInput>(new ScalarExpression1<TInput, Date, Date>(new TruncateToMonthExpression(), this.getBuilder()));
	}

}
