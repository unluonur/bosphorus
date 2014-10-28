package org.bosphorus.expression;

import org.bosphorus.stream.ITuple;

public class Convert<TOutput, TSource> implements IExpression<TOutput> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2025249527382007687L;
	
	private IExpression<TSource> value;
	
	public Convert() {
		
	}
	
	public Convert(IExpression<TSource> value) {
		this.setValue(value);
	}

	public IExpression<TSource> getValue() {
		return value;
	}

	public void setValue(IExpression<TSource> value) {
		this.value = value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public TOutput execute(ITuple input) throws Exception {
		return (TOutput)this.getValue().execute(input);
	}

}
