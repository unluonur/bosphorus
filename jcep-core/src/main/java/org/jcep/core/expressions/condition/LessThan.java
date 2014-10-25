package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class LessThan<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2410365339123568819L;

	public LessThan() {
		
	}
	
	public LessThan(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) < 0;
	}

}
