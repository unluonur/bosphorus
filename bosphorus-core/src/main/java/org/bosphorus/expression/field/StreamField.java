package org.bosphorus.expression.field;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class StreamField<TInput extends List<Object>, TType> implements IExpression<TInput, TType> {
	
	private Integer fieldIndex;
	
	public StreamField(Integer fieldIndex) {
		this.setFieldIndex(fieldIndex);
	}

	public Integer getFieldIndex() {
		return fieldIndex;
	}

	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TType execute(TInput input) {
		return (TType)input.get(this.getFieldIndex());
	}
}
