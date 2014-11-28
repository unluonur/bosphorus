package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public abstract class BaseUnaryConditionExecutor<TInput, TType> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, TType> value;
	
	public BaseUnaryConditionExecutor(IScalarExecutor<TInput, TType> value) {
		this.setValue(value);
	}

	public IScalarExecutor<TInput, TType> getValue() {
		return value;
	}

	public void setValue(IScalarExecutor<TInput, TType> value) {
		this.value = value;
	}

}
