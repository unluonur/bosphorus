package org.bosphorus.expression;

public class Constant<TInput, TOutput> implements IExpression <TInput, TOutput> {
		
	private TOutput value;
		
	public Constant(TOutput value) {
		this.value = value;
	}

	public TOutput execute(TInput input) {
		return value;
	}

}
