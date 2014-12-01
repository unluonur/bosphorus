package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class GreaterThanExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, TType> left;
	private IScalarExecutor<TInput, TType> right;

	public GreaterThanExecutor(IScalarExecutor<TInput, TType> left, IScalarExecutor<TInput, TType> right) {
		this.left = left;
		this.right = right;
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.left.execute(input);
		TType right = this.right.execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) > 0;
	}

}
