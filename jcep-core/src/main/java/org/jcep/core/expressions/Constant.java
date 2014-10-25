package org.jcep.core.expressions;


public class Constant<TType, TContext> implements IExpression<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7692946223335738162L;
	
	private TType value;
	
	public Constant() {
		
	}
	
	public Constant(TType value) {
		this.setValue(value);
	}

	public TType getValue() {
		return value;
	}

	public void setValue(TType value) {
		this.value = value;
	}

	public TType execute(TContext context) {
		return this.getValue();
	}

}
