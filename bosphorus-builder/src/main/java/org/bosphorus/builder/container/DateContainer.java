package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.core.expression.IExpression;
import org.bosphorus.core.expression.date.DayOfMonth;
import org.bosphorus.core.expression.date.DayOfWeek;
import org.bosphorus.core.expression.date.Hour;
import org.bosphorus.core.expression.date.Minute;
import org.bosphorus.core.expression.date.Month;
import org.bosphorus.core.expression.date.Second;
import org.bosphorus.core.expression.date.Year;

public class DateContainer<TInput> extends BaseComparableContainer<TInput, Date> {

	public DateContainer(IExpression<TInput, Date> expression) {
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
