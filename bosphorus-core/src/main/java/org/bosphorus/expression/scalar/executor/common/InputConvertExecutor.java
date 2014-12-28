package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class InputConvertExecutor<TInput, TType, TOutput> implements IScalarExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, TType> converter;
	private IScalarExecutor<TType, TOutput> executor;
	
	@Override
	public TOutput execute(TInput input) throws Exception {
		return executor.execute(converter.execute(input));
	}
}
