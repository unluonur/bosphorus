package org.bosphorus.expression;

public class Convert<TInput, TOutput, TSource> implements IExpression<TInput, TOutput> {
	
	private IExpression<TInput, TSource> value;
	
	public Convert(IExpression<TInput, TSource> value) {
		this.value = value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		return (TOutput)value.execute(input);
	}

}
