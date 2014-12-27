package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ToStringExecutor<TInput> implements IScalarExecutor<TInput, String> {
	private IScalarExecutor<? super TInput, ?> expression;
	
	public ToStringExecutor(IScalarExecutor<? super TInput, ?> expression) {
		this.expression = expression;
	}
	
	@Override
	public String execute(TInput input) throws Exception {
		return expression.execute(input).toString();
	}

}
