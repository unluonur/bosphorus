package org.bosphorus.expression;

import org.bosphorus.stream.ITuple;


public class Constant<TOutput> implements IExpression<TOutput> {
	
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

	public TOutput execute(ITuple input) {
		return this.getValue();
	}

}
