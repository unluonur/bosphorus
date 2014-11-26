package org.bosphorus.expression.scalar.condition;

import java.util.List;

import org.bosphorus.expression.scalar.IScalarExecutor;

public abstract class BaseListComparison<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, TType> value;
	private IScalarExecutor<TInput, List<TType>> list;

	public BaseListComparison(IScalarExecutor<TInput, TType> value, IScalarExecutor<TInput, List<TType>> list) {
		this.setValue(value);
		this.setList(list);
	}
	
	public IScalarExecutor<TInput, TType> getValue() {
		return value;
	}
	
	public void setValue(IScalarExecutor<TInput, TType> value) {
		this.value = value;
	}
	
	public IScalarExecutor<TInput, List<TType>> getList() {
		return list;
	}
	
	public void setList(IScalarExecutor<TInput, List<TType>> list) {
		this.list = list;
	}

}
