package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class LessThanOrEqual<TInput, TOutput extends Comparable<TOutput>> extends BaseComparison<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250387200507384768L;

	public LessThanOrEqual() {
		
	}
	
	public LessThanOrEqual(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TOutput left = this.getLeft().execute(input);
		TOutput right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}
