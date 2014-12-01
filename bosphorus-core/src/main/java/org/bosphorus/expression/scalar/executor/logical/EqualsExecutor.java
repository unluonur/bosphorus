package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class EqualsExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, TType> left;
	private IScalarExecutor<TInput, TType> right;

	public EqualsExecutor(IScalarExecutor<TInput, TType> left, IScalarExecutor<TInput, TType> right) {
		this.left = left;
		this.right = right;
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.left.execute(input);
		TType right = this.right.execute(input);
		if(left == null) {
			return right == null;
		}
		return left.equals(right);
	}

}
