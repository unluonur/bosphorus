package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class NotEquals<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -482856060241315973L;

	public NotEquals() {
		
	}
	
	public NotEquals(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right != null;
		}
		return !left.equals(right);
	}

}
