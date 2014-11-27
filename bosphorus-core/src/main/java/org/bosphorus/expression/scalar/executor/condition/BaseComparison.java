package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public abstract class BaseComparison<TInput, TType extends Comparable<TType>> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, TType> left;
	private IScalarExecutor<TInput, TType> right;

	public BaseComparison(IScalarExecutor<TInput, TType> left, IScalarExecutor<TInput, TType> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IScalarExecutor<TInput, TType> getLeft() {
		return left;
	}

	public void setLeft(IScalarExecutor<TInput, TType> left) {
		this.left = left;
	}

	public IScalarExecutor<TInput, TType> getRight() {
		return right;
	}

	public void setRight(IScalarExecutor<TInput, TType> right) {
		this.right = right;
	}

}
