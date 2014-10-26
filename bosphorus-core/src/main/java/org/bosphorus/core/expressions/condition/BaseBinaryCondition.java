package org.bosphorus.core.expressions.condition;

import org.bosphorus.core.expressions.IExpression;

public abstract class BaseBinaryCondition<TInput> implements IExpression<TInput, Boolean> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7116031993084212345L;
	
	private IExpression<TInput, Boolean> left;
	private IExpression<TInput, Boolean> right;
	
	public BaseBinaryCondition(IExpression<TInput, Boolean> left, IExpression<TInput, Boolean> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IExpression<TInput, Boolean> getLeft() {
		return left;
	}

	public void setLeft(IExpression<TInput, Boolean> left) {
		this.left = left;
	}

	public IExpression<TInput, Boolean> getRight() {
		return right;
	}

	public void setRight(IExpression<TInput, Boolean> right) {
		this.right = right;
	}

}
