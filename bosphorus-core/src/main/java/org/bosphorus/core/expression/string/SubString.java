package org.bosphorus.core.expression.string;

import org.bosphorus.core.expression.IExpression;

public class SubString<TInput> implements IExpression<TInput, String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4211643535077089466L;
	
	private IExpression<TInput, String> value;
	private IExpression<TInput, Integer> startIndex;
	private IExpression<TInput, Integer> length;
	
	public SubString() {
	}
	
	public SubString(IExpression<TInput, String> value, IExpression<TInput, Integer> startIndex, IExpression<TInput, Integer> length) {
	}


	public IExpression<TInput, String> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, String> value) {
		this.value = value;
	}

	public IExpression<TInput, Integer> getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(IExpression<TInput, Integer> startIndex) {
		this.startIndex = startIndex;
	}

	public IExpression<TInput, Integer> getLength() {
		return length;
	}

	public void setLength(IExpression<TInput, Integer> length) {
		this.length = length;
	}

	@Override
	public String execute(TInput input) throws Exception {
		String value = this.getValue().execute(input);
		Integer startIndex = this.getStartIndex().execute(input);
		Integer endIndex = startIndex + this.getLength().execute(input);
		return value.substring(startIndex, endIndex);
	}

}
