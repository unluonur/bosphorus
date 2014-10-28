package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class Equals<TType extends Comparable<TType>> extends BaseComparison<TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949718832077514015L;

	public Equals() {
		
	}
	
	public Equals(IExpression<TType> left, IExpression<TType> right) {
		super(left, right);
	}
	
	public Boolean execute(ITuple input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.equals(right);
	}

}
