package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;

public class Minute<TInput> implements IExpression<TInput, Integer> {
	
	private IExpression<TInput, Date> value;
	
	public Minute(IExpression<TInput, Date> value) {
		this.value = value;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).getMinutes();
	}

}
