package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public abstract class BaseBinaryOperator<TOutput extends Number> implements IExpression<TOutput> {
	
	private IExpression<TOutput> left;
	private IExpression<TOutput> right;
	
	public BaseBinaryOperator(IExpression<TOutput> left, IExpression<TOutput> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IExpression<TOutput> getLeft() {
		return left;
	}
	
	public void setLeft(IExpression<TOutput> left) {
		this.left = left;
	}
	
	public IExpression<TOutput> getRight() {
		return right;
	}
	
	public void setRight(IExpression<TOutput> right) {
		this.right = right;
	}

}
