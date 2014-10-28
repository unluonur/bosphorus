package org.bosphorus.expression.field;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public abstract class BaseFieldByIndex<TType> implements IExpression<TType> {
	
	private Integer fieldIndex;
	
	public BaseFieldByIndex(Integer fieldIndex) {
		this.setFieldIndex(fieldIndex);
	}

	public Integer getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}
}
