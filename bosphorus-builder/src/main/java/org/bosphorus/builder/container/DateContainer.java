package org.bosphorus.builder.container;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.expression.date.DayOfMonth;
import org.bosphorus.expression.date.DayOfWeek;
import org.bosphorus.expression.date.Hour;
import org.bosphorus.expression.date.Minute;
import org.bosphorus.expression.date.Month;
import org.bosphorus.expression.date.Second;
import org.bosphorus.expression.date.Year;

public class DateContainer extends BaseComparableContainer<Date> {

	public DateContainer(IExpression<Date> expression) {
		super(expression);
	}
	
	public IntegerContainer dayOfMonth() {
		return new IntegerContainer(new DayOfMonth(this.getExpression()));
	}
	
	public IntegerContainer dayOfWeek() {
		return new IntegerContainer(new DayOfWeek(this.getExpression()));
	}
	
	public IntegerContainer month() {
		return new IntegerContainer(new Month(this.getExpression()));
	}
	
	public IntegerContainer year() {
		return new IntegerContainer(new Year(this.getExpression()));
	}
	
	public IntegerContainer hour() {
		return new IntegerContainer(new Hour(this.getExpression()));
	}
	
	public IntegerContainer minute() {
		return new IntegerContainer(new Minute(this.getExpression()));
	}
	
	public IntegerContainer second() {
		return new IntegerContainer(new Second(this.getExpression()));
	}

}
