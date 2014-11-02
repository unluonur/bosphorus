package org.bosphorus.expression.field;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class MultiStreamField<TInput extends List<List<Object>>, TOutput> implements IExpression<TInput, TOutput> {
	private Integer streamIndex;
	private Integer fieldIndex;
	
	public MultiStreamField(Integer streamIndex, Integer fieldIndex) {
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

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		List<Object> streamRow = input.get(this.getStreamIndex());
		if(streamRow != null) {
			return (TOutput)(streamRow.get(this.getFieldIndex()));	
		}
		return null;
	}
	
}
