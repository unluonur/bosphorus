package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class LessThan<TInput, TOutput extends Comparable<TOutput>> extends BaseComparison<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2410365339123568819L;

	public LessThan() {
		
	}
	
	public LessThan(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TOutput left = this.getLeft().execute(input);
		TOutput right = this.getRight().execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) < 0;
	}

}
