package org.bosphorus.api.expression.scalar.condition;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;

public abstract class BaseListComparisonExpression<TInput, TType> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<TType> list;

	public List<TType> getList() {
		return list;
	}

	public void setList(List<TType> list) {
		this.list = list;
	}
	

}
