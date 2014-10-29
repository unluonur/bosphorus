package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public abstract class BaseListField<TInput extends List<Object>, TType> implements IExpression<TInput, TType> {
	
	private Integer index;
	
	public BaseListField(Integer index) {
		this.setIndex(index);
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer fieldIndex) {
		this.index = fieldIndex;
	}
}
