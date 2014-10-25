package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public abstract class BaseBinaryCondition<TContext> implements IExpression<Boolean, TContext> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7116031993084212345L;
	
	private IExpression<Boolean, TContext> left;
	private IExpression<Boolean, TContext> right;
	
	public BaseBinaryCondition(IExpression<Boolean, TContext> left, IExpression<Boolean, TContext> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IExpression<Boolean, TContext> getLeft() {
		return left;
	}

	public void setLeft(IExpression<Boolean, TContext> left) {
		this.left = left;
	}

	public IExpression<Boolean, TContext> getRight() {
		return right;
	}

	public void setRight(IExpression<Boolean, TContext> right) {
		this.right = right;
	}

}
