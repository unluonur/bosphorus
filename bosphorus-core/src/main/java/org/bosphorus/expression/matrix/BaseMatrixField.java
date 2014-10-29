package org.bosphorus.expression.matrix;

import java.util.List;

import org.bosphorus.expression.IExpression;

public abstract class BaseMatrixField<TInput extends List<List<Object>>, TOutput> implements IExpression<TInput, TOutput> {
	private Integer index1;
	private Integer index2;
	
	public BaseMatrixField(Integer index1, Integer index2) {
		this.setIndex1(index1);
		this.setIndex2(index2);
	}
	
	public Integer getIndex1() {
		return index1;
	}
	
	public void setIndex1(Integer index1) {
		this.index1 = index1;
	}
	
	public Integer getIndex2() {
		return index2;
	}
	
	public void setIndex2(Integer index2) {
		this.index2 = index2;
	}
	
}
