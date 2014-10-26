package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class GreaterThanOrEqual<TInput, TOutput extends Comparable<TOutput>> extends BaseComparison<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3450625731326145835L;

	public GreaterThanOrEqual() {
		
	}
	
	public GreaterThanOrEqual(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TOutput left = this.getLeft().execute(input);
		TOutput right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) >= 0;
	}

}
