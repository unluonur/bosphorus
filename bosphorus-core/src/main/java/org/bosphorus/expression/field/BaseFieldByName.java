package org.bosphorus.expression.field;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public abstract class BaseFieldByName<TType> implements IExpression<TType> {
	
	private String fieldName;
	
	public BaseFieldByName(String fieldName) {
		this.setFieldName(fieldName);
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
