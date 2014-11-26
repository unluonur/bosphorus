package org.bosphorus.expression.scalar.string;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class SubString<TInput> implements IScalarExecutor<TInput, String> {
	
	private IScalarExecutor<TInput, String> value;
	private IScalarExecutor<TInput, Integer> startIndex;
	private IScalarExecutor<TInput, Integer> length;
	
	public SubString(IScalarExecutor<TInput, String> value, IScalarExecutor<TInput, Integer> startIndex, IScalarExecutor<TInput, Integer> length) {
		this.value = value;
		this.startIndex = startIndex;
		this.length = length;
	}

	@Override
	public String execute(TInput input) throws Exception {
		String value = this.value.execute(input);
		Integer startIndex = this.startIndex.execute(input);
		Integer endIndex = startIndex + length.execute(input);
		return value.substring(startIndex, endIndex);
	}

}
