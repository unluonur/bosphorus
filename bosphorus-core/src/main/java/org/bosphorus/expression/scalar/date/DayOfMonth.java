package org.bosphorus.expression.scalar.date;

import java.util.Date;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class DayOfMonth<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<TInput, Date> value;

	public DayOfMonth(IScalarExecutor<TInput, Date> value) {
		this.value = value;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).getDate();
	}

}
