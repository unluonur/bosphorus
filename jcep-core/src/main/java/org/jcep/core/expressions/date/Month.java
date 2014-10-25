package org.jcep.core.expressions.date;

import java.util.Date;

import org.jcep.core.expressions.IExpression;

public class Month<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5405541979009970275L;
	
	private IExpression<Date, TContext> value;
	
	public Month() {
	}
	
	public Month(IExpression<Date, TContext> value) {
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
		return this.getValue().execute(context).getMonth();
	}

}
