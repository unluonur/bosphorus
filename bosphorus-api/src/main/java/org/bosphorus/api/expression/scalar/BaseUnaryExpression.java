package org.bosphorus.api.expression.scalar;

public abstract class BaseUnaryExpression<TInput, TType, TOutput> implements IScalarExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, TType> value;
	
	public BaseUnaryExpression(IScalarExpression<TInput, TType> value) {
		this.setValue(value);
	}

	public IScalarExpression<TInput, TType> getValue() {
		return value;
	}

	public void setValue(IScalarExpression<TInput, TType> value) {
		this.value = value;
	}

}
