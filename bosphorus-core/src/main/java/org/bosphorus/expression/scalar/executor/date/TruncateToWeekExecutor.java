package org.bosphorus.expression.scalar.executor.date;

import java.util.Calendar;
import java.util.Date;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class TruncateToWeekExecutor<TInput> implements IScalarExecutor<TInput, Date> {
	private IScalarExecutor<? super TInput, Date> expression;
	
	public TruncateToWeekExecutor(IScalarExecutor<? super TInput, Date> expression) {
		this.expression = expression;
	}

	@Override
	public Date execute(TInput input) throws Exception {
		// TODO can be optimized
		Date date = expression.execute(input);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
		while(cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
	        cal.add(Calendar.DATE, -1);
		}
		return cal.getTime();
	}
}
