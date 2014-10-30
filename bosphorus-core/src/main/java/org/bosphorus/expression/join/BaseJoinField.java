package org.bosphorus.expression.join;

import java.util.List;

import org.bosphorus.expression.IExpression;

public abstract class BaseJoinField<TInput extends List<List<Object>>, TOutput> implements IExpression<TInput, TOutput> {
	private Integer streamIndex;
	private Integer fieldIndex;
	
	public BaseJoinField(Integer streamIndex, Integer fieldIndex) {
		this.setStreamIndex(streamIndex);
		this.setFieldIndex(fieldIndex);
	}
	
	public Integer getStreamIndex() {
		return streamIndex;
	}
	
	public void setStreamIndex(Integer streamIndex) {
		this.streamIndex = streamIndex;
	}
	
	public Integer getFieldIndex() {
		return fieldIndex;
	}
	
	public void setFieldIndex(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

}
