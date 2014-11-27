package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;
import org.bosphorus.expression.scalar.executor.date.DayOfMonth;
import org.bosphorus.expression.scalar.executor.date.DayOfWeek;
import org.bosphorus.expression.scalar.executor.date.Hour;
import org.bosphorus.expression.scalar.executor.date.Minute;
import org.bosphorus.expression.scalar.executor.date.Month;
import org.bosphorus.expression.scalar.executor.date.Second;
import org.bosphorus.expression.scalar.executor.date.Year;

public class DateContainer<TInput> extends BaseComparableContainer<TInput, Date> {

	public DateContainer(IScalarExecutor<TInput, Date> expression) {
		super(expression);
	}
	
	public IntegerContainer<TInput> dayOfMonth() {
		return new IntegerContainer<TInput>(new DayOfMonth<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> dayOfWeek() {
		return new IntegerContainer<TInput>(new DayOfWeek<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> month() {
		return new IntegerContainer<TInput>(new Month<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> year() {
		return new IntegerContainer<TInput>(new Year<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> hour() {
		return new IntegerContainer<TInput>(new Hour<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> minute() {
		return new IntegerContainer<TInput>(new Minute<TInput>(this.getExpression()));
	}
	
	public IntegerContainer<TInput> second() {
		return new IntegerContainer<TInput>(new Second<TInput>(this.getExpression()));
	}

}
