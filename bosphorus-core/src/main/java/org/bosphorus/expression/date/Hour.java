package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class Hour implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5227154640492699704L;
	
	private IExpression<Date> value;
	
	public Hour() {
	}
	
	public Hour(IExpression<Date> value) {
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
		return this.getValue().execute(input).getHours();
	}

}
