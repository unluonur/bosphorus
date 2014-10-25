package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class GreaterThan<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663170692244945292L;

	public GreaterThan() {
		
	}
	
	public GreaterThan(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) > 0;
	}

}
