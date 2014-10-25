package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.common.IExpression;

public abstract class BaseListComparison<TType extends Comparable<TType>, TContext> implements IExpression<Boolean, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428482165130602494L;
	
	private IExpression<TType, TContext> value;
	private ArrayList<IExpression<TType, TContext>> list;
	
	
	public BaseListComparison(IExpression<TType, TContext> value, ArrayList<IExpression<TType, TContext>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IExpression<TType, TContext> getValue() {
		return value;
	}
	
	public void setValue(IExpression<TType, TContext> value) {
		this.value = value;
	}
	
	public ArrayList<IExpression<TType, TContext>> getList() {
		return list;
	}
	
	public void setList(ArrayList<IExpression<TType, TContext>> list) {
		this.list = list;
	}

}
