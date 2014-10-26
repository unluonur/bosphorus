package org.bosphorus.core.expression.condition;

import java.util.ArrayList;

import org.bosphorus.core.expression.IExpression;

public abstract class BaseListComparison<TInput, TType extends Comparable<TType>> implements IExpression<TInput, Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428482165130602494L;
	
	private IExpression<TInput, TType> value;
	private ArrayList<IExpression<TInput, TType>> list;
	
	
	public BaseListComparison(IExpression<TInput, TType> value, ArrayList<IExpression<TInput, TType>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IExpression<TInput, TType> getValue() {
		return value;
	}
	
	public void setValue(IExpression<TInput, TType> value) {
		this.value = value;
	}
	
	public ArrayList<IExpression<TInput, TType>> getList() {
		return list;
	}
	
	public void setList(ArrayList<IExpression<TInput, TType>> list) {
		this.list = list;
	}

}
