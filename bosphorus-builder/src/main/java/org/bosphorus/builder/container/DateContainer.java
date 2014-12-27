package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.date.DayOfMonthExecutor;
import org.bosphorus.expression.scalar.executor.date.DayOfWeekExecutor;
import org.bosphorus.expression.scalar.executor.date.HourExecutor;
import org.bosphorus.expression.scalar.executor.date.MinuteExecutor;
import org.bosphorus.expression.scalar.executor.date.MonthExecutor;
import org.bosphorus.expression.scalar.executor.date.SecondExecutor;
import org.bosphorus.expression.scalar.executor.date.YearExecutor;

public class DateContainer<TInput> extends BaseComparableContainer<TInput, Date> {

	public DateContainer(IScalarExecutor<TInput, Date> expression) {
		super(expression);
	}
	
	public IntegerContainer<TInput> dayOfMonth() {
		return new IntegerContainer<TInput>(new DayOfMonthExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> dayOfWeek() {
		return new IntegerContainer<TInput>(new DayOfWeekExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> month() {
		return new IntegerContainer<TInput>(new MonthExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> year() {
		return new IntegerContainer<TInput>(new YearExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> hour() {
		return new IntegerContainer<TInput>(new HourExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> minute() {
		return new IntegerContainer<TInput>(new MinuteExecutor<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> second() {
		return new IntegerContainer<TInput>(new SecondExecutor<TInput>(this.getExpression()));
	}

}
