package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class DayOfMonth<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 10769287980143654L;
	
	private IExpression<TInput, Date> value;
	
	public DayOfMonth() {
	}
	
	public DayOfMonth(IExpression<TInput, Date> value) {
		this.setValue(value);
	}

	public IExpression<TInput, Date> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, Date> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TInput input) throws Exception {
		return this.getValue().execute(input).getDate();
	}

}
