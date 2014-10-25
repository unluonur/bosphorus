package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.common.IExpression;

public class Year<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 634204557378536229L;
	
	private IExpression<Date, TContext> value;
	
	public Year() {
	}
	
	public Year(IExpression<Date, TContext> value) {
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
		return this.getValue().execute(context).getYear();
	}

}
