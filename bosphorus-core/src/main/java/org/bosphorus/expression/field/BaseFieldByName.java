package org.bosphorus.expression.field;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public abstract class BaseFieldByName<TInput, TType> implements IExpression<TInput, TType> {
	
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
