package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public abstract class BaseUnaryCondition<TInput, TType> implements IExpression<TInput, Boolean> {
	
	private IExpression<TInput, TType> value;
	
	public BaseUnaryCondition(IExpression<TInput, TType> value) {
		this.setValue(value);
	}

	public IExpression<TInput, TType> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, TType> value) {
		this.value = value;
	}

}
