package org.bosphorus.expression.scalar;

public class ConvertExecutor<TInput, TOutput, TSource> implements IScalarExecutor<TInput, TOutput> {
	
	private IScalarExecutor<TInput, TSource> value;
	
	public ConvertExecutor(IScalarExecutor<TInput, TSource> value) {
		this.value = value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		return (TOutput)value.execute(input);
	}

}
