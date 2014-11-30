package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class LongIdentityExecutor<TInput> implements IScalarExecutor<TInput, Long> {
	private Long identity = 0L;

	@Override
	public Long execute(TInput input) throws Exception {
		return ++identity;
	}
	
	
}
