package org.bosphorus.expression.scalar.executor.date;

import java.util.Calendar;
import java.util.Date;

import org.bosphorus.expression.scalar.executor.BaseStatelessExecutor1;

public class TruncateToWeekExecutor extends BaseStatelessExecutor1<Date, Date> {
	
	@Override
	public Date execute(Date input) throws Exception {
		// TODO can be optimized
		Calendar cal = Calendar.getInstance();
		cal.setTime(input);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), 0, 0, 0);
		while(cal.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
	        cal.add(Calendar.DATE, -1);
		}
		return cal.getTime();
	}
}
