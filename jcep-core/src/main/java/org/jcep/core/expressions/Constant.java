package org.jcep.core.expressions;


public class Constant<TInput, TOutput> implements IExpression<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7692946223335738162L;
	
	private TOutput value;
	
	public Constant() {
		
	}
	
	public Constant(TOutput value) {
		this.setValue(value);
	}

	public TOutput getValue() {
		return value;
	}

	public void setValue(TOutput value) {
		this.value = value;
	}

	public TOutput execute(TInput input) {
		return this.getValue();
	}

}
