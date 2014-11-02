package org.bosphorus.expression.date;

import java.util.Date;

import org.bosphorus.expression.IExpression;

public class Year<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 634204557378536229L;
	
	private IExpression<TInput, Date> value;
	
	public Year() {
	}
	
	public Year(IExpression<TInput, Date> value) {
		this.setValue(value);
	}

	public IExpression<TInput, Date> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, Date> value) {
		this.value = value;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Integer execute(TInput input) throws Exception {
		return this.getValue().execute(input).getYear();
	}

}
