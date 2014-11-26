package org.bosphorus.expression.scalar.string;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class StrIndexOf<TInput> implements IScalarExecutor<TInput, Integer> {
	
	private IScalarExecutor<TInput, String> text;
	private IScalarExecutor<TInput, String> searchString;

	@Override
	public Integer execute(TInput input) throws Exception {
		return text.execute(input).indexOf(searchString.execute(input));
	}

}
