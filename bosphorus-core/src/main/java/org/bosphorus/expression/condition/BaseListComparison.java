package org.bosphorus.expression.condition;

import java.util.ArrayList;

import org.bosphorus.expression.IExpression;

public abstract class BaseListComparison<TType extends Comparable<TType>> implements IExpression<Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428482165130602494L;
	
	private IExpression<TType> value;
	private ArrayList<IExpression<TType>> list;
	
	
	public BaseListComparison(IExpression<TType> value, ArrayList<IExpression<TType>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IExpression<TType> getValue() {
		return value;
	}
	
	public void setValue(IExpression<TType> value) {
		this.value = value;
	}
	
	public ArrayList<IExpression<TType>> getList() {
		return list;
	}
	
	public void setList(ArrayList<IExpression<TType>> list) {
		this.list = list;
	}

}
