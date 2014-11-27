package org.bosphorus.expression.scalar.executor.list;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class MatrixElement<TInput extends List<List<?>>, TOutput> implements IScalarExecutor<TInput, TOutput> {
	private Integer streamIndex;
	private Integer fieldIndex;
	
	public MatrixElement(Integer streamIndex, Integer fieldIndex) {
		this.streamIndex = streamIndex;
		this.fieldIndex = fieldIndex;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		List<?> streamRow = input.get(this.streamIndex);
		if(streamRow != null) {
			return (TOutput)(streamRow.get(this.fieldIndex));	
		}
		return null;
	}
	
}
