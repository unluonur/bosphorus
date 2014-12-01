package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IsNullExecutor<TInput, TType> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, TType> value;

	public IsNullExecutor(IScalarExecutor<TInput, TType> value) {
		this.value = value;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return value.execute(input) == null;
	}

}
