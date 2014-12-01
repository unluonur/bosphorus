package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class NotEquals<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, ? extends TType> left;
	private IScalarExecutor<TInput, ? extends TType> right;

	public NotEquals(IScalarExecutor<TInput, ? extends TType> left, IScalarExecutor<TInput, ? extends TType> right) {
		this.left = left;
		this.right = right;
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.left.execute(input);
		TType right = this.right.execute(input);
		if(left == null) {
			return right != null;
		}
		return !left.equals(right);
	}

}
