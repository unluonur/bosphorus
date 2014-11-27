package org.bosphorus.expression.scalar.executor.list;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListElement<TInput extends List<?>, TType> implements IScalarExecutor<TInput, TType> {
	
	private Integer fieldIndex;
	
	public ListElement(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TType execute(TInput input) {
		return (TType)input.get(fieldIndex);
	}
}
