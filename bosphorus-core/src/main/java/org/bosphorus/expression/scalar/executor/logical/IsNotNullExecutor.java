package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IsNotNullExecutor<TInput, TType> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, TType> value;

	public IsNotNullExecutor(IScalarExecutor<TInput, TType> value) {
		this.value = value;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return value.execute(input) != null;
	}

}
