package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrIndexOfExecutor<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<? super TInput, String> text;
	private IScalarExecutor<? super TInput, String> searchString;

	@Override
	public Integer execute(TInput input) throws Exception {
		return text.execute(input).indexOf(searchString.execute(input));
	}

}
