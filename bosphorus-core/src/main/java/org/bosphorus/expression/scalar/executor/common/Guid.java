package org.bosphorus.expression.scalar.executor.common;

import java.util.UUID;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class Guid<TInput> implements IScalarExecutor<TInput, String> {

	@Override
	public String execute(TInput input) throws Exception {
		return UUID.randomUUID().toString();
	}

}
