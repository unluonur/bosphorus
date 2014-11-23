package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;

public class DayOfWeek<TInput> implements IExpression<TInput, Integer> {
	
	private IExpression<TInput, Date> value;
	
	public DayOfWeek(IExpression<TInput, Date> value) {
		this.value = value;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).getDay();
	}

}
