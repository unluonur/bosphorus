package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class InputExecutor<TType> implements IScalarExecutor<TType, TType> {

	@Override
	public TType execute(TType input) throws Exception {
		return input;
	}

}
