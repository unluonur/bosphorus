package org.jcep.core.expressions.condition;

import java.util.ArrayList;

import org.jcep.core.expressions.IExpression;

public abstract class BaseListComparison<TInput, TOutput extends Comparable<TOutput>> implements IExpression<TInput, Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428482165130602494L;
	
	private IExpression<TInput, TOutput> value;
	private ArrayList<IExpression<TInput, TOutput>> list;
	
	
	public BaseListComparison(IExpression<TInput, TOutput> value, ArrayList<IExpression<TInput, TOutput>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IExpression<TInput, TOutput> getValue() {
		return value;
	}
	
	public void setValue(IExpression<TInput, TOutput> value) {
		this.value = value;
	}
	
	public ArrayList<IExpression<TInput, TOutput>> getList() {
		return list;
	}
	
	public void setList(ArrayList<IExpression<TInput, TOutput>> list) {
		this.list = list;
	}

}
