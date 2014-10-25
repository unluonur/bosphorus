package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.common.IExpression;

public class DayOfWeek<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5672887243443690428L;
	
	private IExpression<Date, TContext> value;
	
	public DayOfWeek() {
	}
	
	public DayOfWeek(IExpression<Date, TContext> value) {
		this.setValue(value);
	}

	public IExpression<Date, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<Date, TContext> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TContext context) {
		return this.getValue().execute(context).getDay();
	}

}
