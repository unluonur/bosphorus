package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.IExpression;

public class Hour<TInput> implements IExpression<TInput, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5227154640492699704L;
	
	private IExpression<TInput, Date> value;
	
	public Hour() {
	}
	
	public Hour(IExpression<TInput, Date> value) {
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
		return this.getValue().execute(input).getHours();
	}

}
