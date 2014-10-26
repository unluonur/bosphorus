package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class GreaterThanOrEqual<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3450625731326145835L;

	public GreaterThanOrEqual() {
		
	}
	
	public GreaterThanOrEqual(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) >= 0;
	}

}
