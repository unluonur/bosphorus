package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class TupleExecutor<TType> implements IScalarExecutor<TType, TType> {

	@Override
	public TType execute(TType input) throws Exception {
		return input;
	}

}
