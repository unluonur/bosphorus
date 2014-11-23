package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public class LessThanOrEqual<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {

	public LessThanOrEqual(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		super(left, right);
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.getLeft().execute(input);
		TType right = this.getRight().execute(input);
		if(left == null) {
			return right == null;
		}
		return left.compareTo(right) <= 0;
	}

}
