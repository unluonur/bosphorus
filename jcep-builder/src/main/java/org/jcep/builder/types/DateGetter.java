package org.jcep.builder.types;

import java.util.Date;

import org.jcep.core.expressions.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.date.DayOfMonth;
import org.jcep.core.expressions.date.DayOfWeek;
import org.jcep.core.expressions.date.Hour;
import org.jcep.core.expressions.date.Minute;
import org.jcep.core.expressions.date.Month;
import org.jcep.core.expressions.date.Now;
import org.jcep.core.expressions.date.Second;
import org.jcep.core.expressions.date.Year;

public class DateGetter<TInput> extends BaseTypeGetter<TInput, Date> {

	public DateGetter(IExpression<TInput, Date> expression) {
		super(expression);
	}
	
	public IntegerGetter<TInput> dayOfMonth() {
		return new IntegerGetter<TInput>(new DayOfMonth<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> dayOfWeek() {
		return new IntegerGetter<TInput>(new DayOfWeek<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> month() {
		return new IntegerGetter<TInput>(new Month<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> year() {
		return new IntegerGetter<TInput>(new Year<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> hour() {
		return new IntegerGetter<TInput>(new Hour<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> minute() {
		return new IntegerGetter<TInput>(new Minute<TInput>(this.getExpression()));
	}
	
	public IntegerGetter<TInput> second() {
		return new IntegerGetter<TInput>(new Second<TInput>(this.getExpression()));
	}

}
