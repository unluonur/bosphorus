package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class GreaterThan<TType extends Comparable<TType>> extends BaseComparison<TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3663170692244945292L;

	public GreaterThan() {
		
	}
	
	public GreaterThan(IExpression<TType> left, IExpression<TType> right) {
		super(left, right);
	}
	
	public Boolean execute(ITuple input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) > 0;
	}

}
