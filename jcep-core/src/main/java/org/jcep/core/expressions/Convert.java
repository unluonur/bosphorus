package org.jcep.core.expressions;

public class Convert<TInput, TOutput, TSource> implements IExpression<TInput, TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2025249527382007687L;
	
	private IExpression<TInput, TSource> value;
	
	public Convert() {
		
	}
	
	public Convert(IExpression<TInput, TSource> value) {
		this.setValue(value);
	}

	public IExpression<TInput, TSource> getValue() {
		return value;
	}

	public void setValue(IExpression<TInput, TSource> value) {
		this.value = value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(TInput input) throws Exception {
		return (TOutput)this.getValue().execute(input);
	}

}
