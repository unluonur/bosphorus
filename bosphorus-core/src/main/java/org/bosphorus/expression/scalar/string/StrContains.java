package org.bosphorus.expression.scalar.string;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrContains<TInput> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, String> text;
	private IScalarExecutor<TInput, String> searchString;

	@Override
	public Boolean execute(TInput input) throws Exception {
		return text.execute(input).contains(searchString.execute(input));
	}

}
