package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public abstract class BaseBinaryCondition<TInput> implements IScalarExecutor<TInput, Boolean> {
	
	private IScalarExecutor<TInput, Boolean> left;
	private IScalarExecutor<TInput, Boolean> right;
	
	public BaseBinaryCondition(IScalarExecutor<TInput, Boolean> left, IScalarExecutor<TInput, Boolean> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IScalarExecutor<TInput, Boolean> getLeft() {
		return left;
	}

	public void setLeft(IScalarExecutor<TInput, Boolean> left) {
		this.left = left;
	}

	public IScalarExecutor<TInput, Boolean> getRight() {
		return right;
	}

	public void setRight(IScalarExecutor<TInput, Boolean> right) {
		this.right = right;
	}

}
