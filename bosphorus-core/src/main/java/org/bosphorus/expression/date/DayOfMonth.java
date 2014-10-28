package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class DayOfMonth implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 10769287980143654L;
	
	private IExpression<Date> value;
	
	public DayOfMonth() {
	}
	
	public DayOfMonth(IExpression<Date> value) {
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
		return this.getValue().execute(input).getDate();
	}

}
