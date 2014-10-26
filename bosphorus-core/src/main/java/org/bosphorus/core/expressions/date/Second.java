package org.bosphorus.core.expressions.date;

import java.util.Date;

import org.bosphorus.core.expressions.IExpression;

public class Second<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7293112921515384397L;
	
	private IExpression<TInput, Date> value;
	
	public Second() {
	}
	
	public Second(IExpression<TInput, Date> value) {
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
		return this.getValue().execute(input).getSeconds();
	}

}
