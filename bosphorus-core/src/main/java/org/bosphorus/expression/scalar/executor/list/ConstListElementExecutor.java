package org.bosphorus.expression.scalar.executor.list;

import java.util.List;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ConstListElementExecutor<TInput extends List<? extends TOutput>, TOutput> implements IScalarExecutor<TInput, TOutput> {

	private Integer fieldIndex;
	
	public ConstListElementExecutor(Integer fieldIndex) {
		this.fieldIndex = fieldIndex;
	}
	
	@Override
	public TOutput execute(TInput input) {
		return input.get(fieldIndex);
	}
	
}
