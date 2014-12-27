package org.bosphorus.expression.scalar.executor.date;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class YearExecutor<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<? super TInput, Date> value;
	
	public YearExecutor(IScalarExecutor<? super TInput, Date> value) {
		this.value = value;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).getYear() + 1900;
	}

}
