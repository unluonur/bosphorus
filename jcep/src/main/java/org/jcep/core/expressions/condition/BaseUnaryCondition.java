package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public abstract class BaseUnaryCondition<TType, TContext> implements IExpression<Boolean, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5255053841479396562L;
	
	private IExpression<TType, TContext> value;
	

	public BaseUnaryCondition(IExpression<TType, TContext> value) {
		this.setValue(value);
	}

	public IExpression<TType, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<TType, TContext> value) {
		this.value = value;
	}

}
