package org.jcep.core.expressions;

public class Convert<TSource, TDest, TContext> implements IExpression<TDest, TContext> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2025249527382007687L;
	
	private IExpression<TSource, TContext> value;
	
	public Convert() {
		
	}
	
	public Convert(IExpression<TSource, TContext> value) {
		this.setValue(value);
	}

	public IExpression<TSource, TContext> getValue() {
		return value;
	}

	public void setValue(IExpression<TSource, TContext> value) {
		this.value = value;
	}

	@Override
	public TDest execute(TContext context) {
		return (TDest)this.getValue().execute(context);
	}

}
