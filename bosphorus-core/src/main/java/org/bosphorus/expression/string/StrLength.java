package org.bosphorus.expression.string;

import org.bosphorus.expression.IExpression;

public class StrLength<TInput> implements IExpression<TInput, Integer> {
	
	private IExpression<TInput, String> value;

	public StrLength(IExpression<TInput, String> value) {
		this.value = value;
	}
	
	@Override
	public Integer execute(TInput input) throws Exception {
		return value.execute(input).length();
	}

}
