package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class NotEquals<TType extends Comparable<TType>> extends BaseComparison<TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -482856060241315973L;

	public NotEquals() {
		
	}
	
	public NotEquals(IExpression<TType> left, IExpression<TType> right) {
		super(left, right);
	}
	
	public Boolean execute(ITuple input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right != null;
		}
		return !left.equals(right);
	}

}
