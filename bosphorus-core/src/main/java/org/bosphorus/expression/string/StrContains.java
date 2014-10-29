package org.bosphorus.expression.string;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class StrContains<TInput> implements IExpression<TInput, Boolean> {
	
	private IExpression<TInput, String> text;
	private IExpression<TInput, String> searchString;

	@Override
	public Boolean execute(TInput input) throws Exception {
		return text.execute(input).contains(searchString.execute(input));
	}

}
