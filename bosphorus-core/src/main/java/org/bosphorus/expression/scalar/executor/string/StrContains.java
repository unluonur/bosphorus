package org.bosphorus.expression.scalar.executor.string;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class StrContains<TInput> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<? super TInput, String> text;
	private IScalarExecutor<? super TInput, String> searchString;

	@Override
	public Boolean execute(TInput input) throws Exception {
		return text.execute(input).contains(searchString.execute(input));
	}

}
