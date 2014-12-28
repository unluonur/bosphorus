package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrLengthExecutor<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<? super TInput, String> value;

	public StrLengthExecutor(IScalarExecutor<? super TInput, String> value) {
		this.value = value;
	}
	
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).length();
	}

}
