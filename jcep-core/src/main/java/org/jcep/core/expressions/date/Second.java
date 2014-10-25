package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.common.IExpression;

public class Second<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7293112921515384397L;
	
	private IExpression<Date, TContext> value;
	
	public Second() {
	}
	
	public Second(IExpression<Date, TContext> value) {
		this.setValue(value);
	}

	public IExpression<Date, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<Date, TContext> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TContext context) {
		return this.getValue().execute(context).getSeconds();
	}

}
