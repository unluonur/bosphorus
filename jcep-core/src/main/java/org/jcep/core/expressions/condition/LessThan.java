package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class LessThan<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2410365339123568819L;

	public LessThan() {
		
	}
	
	public LessThan(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) < 0;
	}

}
