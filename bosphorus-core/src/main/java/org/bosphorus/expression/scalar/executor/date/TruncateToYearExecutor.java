package org.bosphorus.expression.scalar.executor.date;

import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class TruncateToYearExecutor<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<? super TInput, Date> expression;
	
	public TruncateToYearExecutor(IScalarExecutor<? super TInput, Date> expression) {
		this.expression = expression;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Date execute(TInput input) throws Exception {
		Date date = expression.execute(input);
		return new Date(date.getYear(), 0, 1);
	}
}
