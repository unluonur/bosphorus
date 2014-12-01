package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class NotExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, Boolean> value;

	public NotExecutor(IScalarExecutor<TInput, Boolean> value) {
		this.value = value;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !value.execute(input);
	}

}
