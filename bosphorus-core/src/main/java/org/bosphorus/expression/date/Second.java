package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class Second implements IExpression<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7293112921515384397L;
	
	private IExpression<Date> value;
	
	public Second() {
	}
	
	public Second(IExpression<Date> value) {
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
		return this.getValue().execute(input).getSeconds();
	}

}
