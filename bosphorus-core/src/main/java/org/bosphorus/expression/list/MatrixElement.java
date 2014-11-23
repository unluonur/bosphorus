package org.bosphorus.expression.list;

import java.util.List;

import org.bosphorus.expression.IExpression;

public class MatrixElement<TInput extends List<List<Object>>, TOutput> implements IExpression<TInput, TOutput> {
	private Integer streamIndex;
	private Integer fieldIndex;
	
	public MatrixElement(Integer streamIndex, Integer fieldIndex) {
		this.streamIndex = streamIndex;
		this.fieldIndex = fieldIndex;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		List<Object> streamRow = input.get(this.streamIndex);
		if(streamRow != null) {
			return (TOutput)(streamRow.get(this.fieldIndex));	
		}
		return null;
	}
	
}
