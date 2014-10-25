package org.jcep.core.expressions.string;

import org.jcep.core.expressions.common.IExpression;

public class StrLength<TContext> implements IExpression<Integer, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8792321758093603310L;
	
	private IExpression<String, TContext> value;
	
	public StrLength() {
	}
	
	public StrLength(IExpression<String, TContext> value) {
		this.setValue(value);
	}

	public IExpression<String, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<String, TContext> value) {
		this.value = value;
	}

	@Override
	public Integer execute(TContext context) {
		return this.getValue().execute(context).length();
	}

}
