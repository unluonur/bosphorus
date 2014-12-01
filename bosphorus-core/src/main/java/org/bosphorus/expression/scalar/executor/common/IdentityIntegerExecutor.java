package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IdentityIntegerExecutor<TInput> implements IScalarExecutor<TInput, Integer> {
	private Integer identity = 0;

	@Override
	public Integer execute(TInput input) throws Exception {
		return ++identity;
	}

}
