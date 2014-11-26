package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class NotEquals<TInput, TType extends Comparable<TType>> extends BaseComparison<TInput, TType> {

	public NotEquals(IScalarExecutor<TInput, TType> left, IScalarExecutor<TInput, TType> right) {
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
