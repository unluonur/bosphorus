package org.bosphorus.expression.scalar.string;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrLength<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<TInput, String> value;

	public StrLength(IScalarExecutor<TInput, String> value) {
		this.value = value;
	}
	
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).length();
	}

}
