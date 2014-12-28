package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class SubStringExecutor<TInput> implements IScalarExecutor<TInput, String> {
	
	private IScalarExecutor<? super TInput, String> value;
	private IScalarExecutor<? super TInput, Integer> startIndex;
	private IScalarExecutor<? super TInput, Integer> length;
	
	public SubStringExecutor(IScalarExecutor<? super TInput, String> value, 
			IScalarExecutor<? super TInput, Integer> startIndex, 
			IScalarExecutor<? super TInput, Integer> length) {
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
