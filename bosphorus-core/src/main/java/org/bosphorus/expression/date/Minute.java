package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class Minute implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3095952670199685232L;
	
	private IExpression<Date> value;
	
	public Minute() {
	}
	
	public Minute(IExpression<Date> value) {
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
		return this.getValue().execute(input).getMinutes();
	}

}
