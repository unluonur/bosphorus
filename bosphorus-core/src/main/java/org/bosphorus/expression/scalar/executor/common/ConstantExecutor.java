package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ConstantExecutor<TInput, TOutput> implements IScalarExecutor <TInput, TOutput> {
		
	private TOutput value;
		
	public ConstantExecutor(TOutput value) {
		this.value = value;
	}

	public TOutput execute(TInput input) {
		return value;
	}

}
