package org.bosphorus.core.expressions.conditions;

import org.bosphorus.core.expressions.IExpression;

public class LessThanOrEqual<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250387200507384768L;

	public LessThanOrEqual() {
		
	}
	
	public LessThanOrEqual(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}
