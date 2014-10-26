package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class Equals<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949718832077514015L;

	public Equals() {
		
	}
	
	public Equals(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.equals(right);
	}

}
