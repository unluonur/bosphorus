package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class LessThanExecutor<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, ? extends TType> left;
	private IScalarExecutor<? super TInput, ? extends TType> right;

	public LessThanExecutor(IScalarExecutor<? super TInput, ? extends TType> left, 
			IScalarExecutor<? super TInput, ? extends TType> right) {
		this.left = left;
		this.right = right;
	}
	
	public Boolean execute(TInput input) throws Exception {
		TType left = this.left.execute(input);
		TType right = this.right.execute(input);
		if(left == null) {
			return false;
		}
		return left.compareTo(right) < 0;
	}

}
