package org.bosphorus.api.builder.expression.scalar.condition;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public abstract class BaseBinaryConditionExpression<TInput> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IScalarExpression<TInput, Boolean> left;
	private IScalarExpression<TInput, Boolean> right;
	
	public BaseBinaryConditionExpression(IScalarExpression<TInput, Boolean> left, IScalarExpression<TInput, Boolean> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IScalarExpression<TInput, Boolean> getLeft() {
		return left;
	}
	
	public void setLeft(IScalarExpression<TInput, Boolean> left) {
		this.left = left;
	}
	
	public IScalarExpression<TInput, Boolean> getRight() {
		return right;
	}
	
	public void setRight(IScalarExpression<TInput, Boolean> right) {
		this.right = right;
	}

}
