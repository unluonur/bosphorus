package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public abstract class BaseUnaryCondition<TInput, TType> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, TType> value;
	
	public BaseUnaryCondition(IScalarExecutor<TInput, TType> value) {
		this.setValue(value);
	}

	public IScalarExecutor<TInput, TType> getValue() {
		return value;
	}

	public void setValue(IScalarExecutor<TInput, TType> value) {
		this.value = value;
	}

}
