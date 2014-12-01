package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class IsNotNullExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, ?> value;

	public IsNotNullExecutor(IScalarExecutor<TInput, ?> value) {
		this.value = value;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return value.execute(input) != null;
	}

}
