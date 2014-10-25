package org.jcep.storm.expressions;

import org.jcep.core.expressions.common.IExpression;

import backtype.storm.tuple.Tuple;

public abstract class BaseField<TType> implements IExpression<TType, Tuple> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2012943709606976007L;
	
	private String fieldName;
	
	public BaseField(String fieldName) {
		this.setFieldName(fieldName);
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
