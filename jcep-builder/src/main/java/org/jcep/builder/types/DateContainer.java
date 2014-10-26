package org.jcep.builder.types;

import java.util.Date;
import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.date.DayOfMonth;
import org.jcep.core.expressions.date.DayOfWeek;
import org.jcep.core.expressions.date.Hour;
import org.jcep.core.expressions.date.Minute;
import org.jcep.core.expressions.date.Month;
import org.jcep.core.expressions.date.Second;
import org.jcep.core.expressions.date.Year;

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
