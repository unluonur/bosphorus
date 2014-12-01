package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ConvertExecutor<TInput, TOutput, TSource> implements IScalarExecutor<TInput, TOutput> {
	
	private IScalarExecutor<TInput, ? extends TSource> value;
	
	public ConvertExecutor(IScalarExecutor<TInput, ? extends TSource> value) {
		this.value = value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		return (TOutput)value.execute(input);
	}

}
