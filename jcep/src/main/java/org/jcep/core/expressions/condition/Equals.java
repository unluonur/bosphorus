package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public class Equals<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949718832077514015L;

	public Equals() {
		
	}
	
	public Equals(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return right == null;
		}
		return left.equals(right);
	}

}
