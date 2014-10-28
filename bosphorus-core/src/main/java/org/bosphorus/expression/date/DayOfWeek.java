package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class DayOfWeek implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5672887243443690428L;
	
	private IExpression<Date> value;
	
	public DayOfWeek() {
	}
	
	public DayOfWeek(IExpression<Date> value) {
		this.setValue(value);
	}

	public IExpression<Date> getValue() {
		return value;
	}

	public void setValue(IExpression<Date> value) {
		this.value = value;
	}

	@Override
	public Integer execute(ITuple input) throws Exception {
		return this.getValue().execute(input).getDay();
	}

}
