package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class GreaterThanOrEqual<TType extends Comparable<TType>> extends BaseComparison<TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3450625731326145835L;

	public GreaterThanOrEqual() {
		
	}
	
	public GreaterThanOrEqual(IExpression<TType> left, IExpression<TType> right) {
		super(left, right);
	}
	
	public Boolean execute(ITuple input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) >= 0;
	}

}
