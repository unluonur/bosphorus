package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrLength<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<? super TInput, String> value;

	public StrLength(IScalarExecutor<? super TInput, String> value) {
		this.value = value;
	}
	
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).length();
	}

}
