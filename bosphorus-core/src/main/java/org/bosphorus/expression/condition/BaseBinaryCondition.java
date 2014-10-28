package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public abstract class BaseBinaryCondition implements IExpression<Boolean> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7116031993084212345L;
	
	private IExpression<Boolean> left;
	private IExpression<Boolean> right;
	
	public BaseBinaryCondition(IExpression<Boolean> left, IExpression<Boolean> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IExpression<Boolean> getLeft() {
		return left;
	}

	public void setLeft(IExpression<Boolean> left) {
		this.left = left;
	}

	public IExpression<Boolean> getRight() {
		return right;
	}

	public void setRight(IExpression<Boolean> right) {
		this.right = right;
	}

}
