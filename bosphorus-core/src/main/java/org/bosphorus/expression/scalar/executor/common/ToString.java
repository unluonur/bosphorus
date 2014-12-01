package org.bosphorus.expression.scalar.executor.common;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ToString<TInput> implements IScalarExecutor<TInput, String> {
	private IScalarExecutor<TInput, ?> expression;
	
	public ToString(IScalarExecutor<TInput, ?> expression) {
		this.expression = expression;
	}
	
	@Override
	public String execute(TInput input) throws Exception {
		return expression.execute(input).toString();
	}

}
