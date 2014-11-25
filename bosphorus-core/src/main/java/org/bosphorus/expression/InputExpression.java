package org.bosphorus.expression;

public class InputExpression<TInput> implements IExpression<TInput, TInput> {

	@Override
	public TInput execute(TInput input) throws Exception {
		return input;
	}

}
