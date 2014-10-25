package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.common.IExpression;

public class Hour<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5227154640492699704L;
	
	private IExpression<Date, TContext> value;
	
	public Hour() {
	}
	
	public Hour(IExpression<Date, TContext> value) {
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
		return this.getValue().execute(context).getHours();
	}

}
