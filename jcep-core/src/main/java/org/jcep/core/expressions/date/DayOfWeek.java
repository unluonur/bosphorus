package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.IExpression;

public class DayOfWeek<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5672887243443690428L;
	
	private IExpression<TInput, Date> value;
	
	public DayOfWeek() {
	}
	
	public DayOfWeek(IExpression<TInput, Date> value) {
		this.setValue(value);
	}

	public IExpression<TInput, Date> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, Date> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TInput input) {
		return this.getValue().execute(input).getDay();
	}

}
