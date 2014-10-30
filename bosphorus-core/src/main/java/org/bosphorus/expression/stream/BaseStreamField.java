package org.bosphorus.expression.stream;

import java.util.List;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public abstract class BaseStreamField<TInput extends List<Object>, TType> implements IExpression<TInput, TType> {
	
	private Integer fieldIndex;
	
	public BaseStreamField(Integer fieldIndex) {
		this.setFieldIndex(fieldIndex);
	}

	public Integer getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}
}
