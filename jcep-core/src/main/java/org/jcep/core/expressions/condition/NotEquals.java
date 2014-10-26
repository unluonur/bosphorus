package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public class NotEquals<TInput, TOutput extends Comparable<TOutput>> extends BaseComparison<TInput, TOutput> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -482856060241315973L;

	public NotEquals() {
		
	}
	
	public NotEquals(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) {
		TOutput left = this.getLeft().execute(input);
		TOutput right = this.getRight().execute(input);
		if(left == null) {
			return right != null;
		}
		return !left.equals(right);
	}

}
