package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class NotExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, Boolean> value;

	public NotExecutor(IScalarExecutor<? super TInput, Boolean> value) {
		this.value = value;
	}

	@Override
	public Boolean execute(TInput input) throws Exception {
		return !value.execute(input);
	}

}
