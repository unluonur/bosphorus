package org.bosphorus.core.expressions.condition;

import org.bosphorus.core.expressions.IExpression;

public abstract class BaseUnaryCondition<TInput, TOutput> implements IExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5255053841479396562L;
	
	private IExpression<TInput, TOutput> value;
	

	public BaseUnaryCondition(IExpression<TInput, TOutput> value) {
		this.setValue(value);
	}

	public IExpression<TInput, TOutput> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, TOutput> value) {
		this.value = value;
	}

}
