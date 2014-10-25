package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class NotEquals<TType extends Comparable<TType>, TContext> extends BaseComparison<TType, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -482856060241315973L;

	public NotEquals() {
		
	}
	
	public NotEquals(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		super(left, right);
	}
	
	public Boolean execute(TContext context) {
		TType left = this.getLeft().execute(context);
		TType right = this.getRight().execute(context);
		if(left == null) {
			return right != null;
		}
		return !left.equals(right);
	}

}
