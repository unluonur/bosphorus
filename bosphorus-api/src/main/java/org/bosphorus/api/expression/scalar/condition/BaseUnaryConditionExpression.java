package org.bosphorus.api.expression.scalar.condition;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public abstract class BaseUnaryConditionExpression<TInput, TType> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, TType> value;
	
	public BaseUnaryConditionExpression(IScalarExpression<TInput, TType> value) {
		this.setValue(value);
	}

	public IScalarExpression<TInput, TType> getValue() {
		return value;
	}

	public void setValue(IScalarExpression<TInput, TType> value) {
		this.value = value;
	}

}
