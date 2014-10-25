package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class GreaterThanOrEqual<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3450625731326145835L;

	public GreaterThanOrEqual() {
		
	}
	
	public GreaterThanOrEqual(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) >= 0;
	}

}
