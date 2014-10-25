package org.jcep.core.expressions.string;

import org.jcep.core.expressions.common.IExpression;

public class SubString<TContext> implements IExpression<String, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4211643535077089466L;
	
	private IExpression<String, TContext> value;
	private IExpression<Integer, TContext> startIndex;
	private IExpression<Integer, TContext> length;
	
	public SubString() {
	}
	
	public SubString(IExpression<String, TContext> value, IExpression<Integer, TContext> startIndex, IExpression<Integer, TContext> length) {
	}


	public IExpression<String, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<String, TContext> value) {
		this.value = value;
	}

	public IExpression<Integer, TContext> getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(IExpression<Integer, TContext> startIndex) {
		this.startIndex = startIndex;
	}

	public IExpression<Integer, TContext> getLength() {
		return length;
	}

	public void setLength(IExpression<Integer, TContext> length) {
		this.length = length;
	}

	@Override
	public String execute(TContext context) {
		String value = this.getValue().execute(context);
		Integer startIndex = this.getStartIndex().execute(context);
		Integer endIndex = startIndex + this.getLength().execute(context);
		return value.substring(startIndex, endIndex);
	}

}
