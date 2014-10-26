package org.bosphorus.core.expressions.string;

import org.bosphorus.core.expressions.IExpression;

public class StrIndexOf<TInput> implements IExpression<TInput, Integer> {
	
	private IExpression<TInput, String> text;
	private IExpression<TInput, String> searchString;

	@Override
	public Integer execute(TInput input) throws Exception {
		return text.execute(input).indexOf(searchString.execute(input));
	}

}