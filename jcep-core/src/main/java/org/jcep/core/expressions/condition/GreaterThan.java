package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class GreaterThan<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663170692244945292L;

	public GreaterThan() {
		
	}
	
	public GreaterThan(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) > 0;
	}

}
