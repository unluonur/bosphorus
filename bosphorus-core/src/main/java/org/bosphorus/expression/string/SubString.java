package org.bosphorus.expression.string;

import org.bosphorus.expression.IExpression;

public class SubString<TInput> implements IExpression<TInput, String> {
	
	private IExpression<TInput, String> value;
	private IExpression<TInput, Integer> startIndex;
	private IExpression<TInput, Integer> length;
	
	public SubString(IExpression<TInput, String> value, IExpression<TInput, Integer> startIndex, IExpression<TInput, Integer> length) {
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
