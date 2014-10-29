package org.bosphorus.expression.string;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class SubString implements IExpression<String> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4211643535077089466L;
	
	private IExpression<String> value;
	private IExpression<Integer> startIndex;
	private IExpression<Integer> length;
	
	public SubString() {
	}
	
	public SubString(IExpression<String> value, IExpression<Integer> startIndex, IExpression<Integer> length) {
	}


	public IExpression<String> getValue() {
		return value;
	}

	public void setValue(IExpression<String> value) {
		this.value = value;
	}

	public IExpression<Integer> getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(IExpression<Integer> startIndex) {
		this.startIndex = startIndex;
	}

	public IExpression<Integer> getLength() {
		return length;
	}

	public void setLength(IExpression<Integer> length) {
		this.length = length;
	}

	@Override
	public String execute(ITuple input) throws Exception {
		String value = this.getValue().execute(input);
		Integer startIndex = this.getStartIndex().execute(input);
		Integer endIndex = startIndex + this.getLength().execute(input);
		return value.substring(startIndex, endIndex);
	}

}
