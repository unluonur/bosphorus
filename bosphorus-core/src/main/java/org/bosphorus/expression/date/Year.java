package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class Year implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 634204557378536229L;
	
	private IExpression<Date> value;
	
	public Year() {
	}
	
	public Year(IExpression<Date> value) {
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
		return this.getValue().execute(input).getYear();
	}

}
