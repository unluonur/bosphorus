package org.bosphorus.expression.condition;

import java.util.List;

import org.bosphorus.expression.IExpression;

public abstract class BaseListComparison<TInput, TType extends Comparable<TType>> implements IExpression<TInput, Boolean> {
	
	private IExpression<TInput, TType> value;
	private IExpression<TInput, List<TType>> list;

	public BaseListComparison(IExpression<TInput, TType> value, IExpression<TInput, List<TType>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IExpression<TInput, TType> getValue() {
		return value;
	}
	
	public void setValue(IExpression<TInput, TType> value) {
		this.value = value;
	}
	
	public IExpression<TInput, List<TType>> getList() {
		return list;
	}
	
	public void setList(IExpression<TInput, List<TType>> list) {
		this.list = list;
	}

}
