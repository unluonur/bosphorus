package org.bosphorus.expression.condition;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class LessThanOrEqual<TType extends Comparable<TType>> extends BaseComparison<TType> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5250387200507384768L;

	public LessThanOrEqual() {
		
	}
	
	public LessThanOrEqual(IExpression<TType> left, IExpression<TType> right) {
		super(left, right);
	}
	
	public Boolean execute(ITuple input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}
