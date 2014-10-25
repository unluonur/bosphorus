package org.jcep.builder.types;

import java.util.Date;

import org.jcep.core.expressions.common.IExpression;
import org.jcep.core.expressions.condition.LessThan;
import org.jcep.core.expressions.date.DayOfMonth;
import org.jcep.core.expressions.date.DayOfWeek;
import org.jcep.core.expressions.date.Hour;
import org.jcep.core.expressions.date.Minute;
import org.jcep.core.expressions.date.Month;
import org.jcep.core.expressions.date.Now;
import org.jcep.core.expressions.date.Second;
import org.jcep.core.expressions.date.Year;

public class DateGetter<TContext> extends BaseTypeGetter<Date, TContext> {

	public DateGetter(IExpression<Date, TContext> expression) {
		super(expression);
	}
	
	public IntegerGetter<TContext> dayOfMonth() {
		return new IntegerGetter<TContext>(new DayOfMonth<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> dayOfWeek() {
		return new IntegerGetter<TContext>(new DayOfWeek<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> month() {
		return new IntegerGetter<TContext>(new Month<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> year() {
		return new IntegerGetter<TContext>(new Year<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> hour() {
		return new IntegerGetter<TContext>(new Hour<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> minute() {
		return new IntegerGetter<TContext>(new Minute<TContext>(this.getExpression()));
	}
	
	public IntegerGetter<TContext> second() {
		return new IntegerGetter<TContext>(new Second<TContext>(this.getExpression()));
	}

}
