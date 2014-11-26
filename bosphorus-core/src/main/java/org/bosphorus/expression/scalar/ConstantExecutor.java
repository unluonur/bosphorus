package org.bosphorus.expression.scalar;

public class ConstantExecutor<TInput, TOutput> implements IScalarExecutor <TInput, TOutput> {
		
	private TOutput value;
		
	public ConstantExecutor(TOutput value) {
		this.value = value;
	}

	public TOutput execute(TInput input) {
		return value;
	}

}
