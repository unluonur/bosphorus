package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public class LessThanOrEqual<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250387200507384768L;

	public LessThanOrEqual() {
		
	}
	
	public LessThanOrEqual(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}
