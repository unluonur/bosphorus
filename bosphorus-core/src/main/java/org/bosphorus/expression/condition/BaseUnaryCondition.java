package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public abstract class BaseUnaryCondition<TType> implements IExpression<Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5255053841479396562L;
	
	private IExpression<TType> value;
	

	public BaseUnaryCondition(IExpression<TType> value) {
		this.setValue(value);
	}

	public IExpression<TType> getValue() {
		return value;
	}

	public void setValue(IExpression<TType> value) {
		this.value = value;
	}

}
