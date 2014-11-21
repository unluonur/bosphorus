package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public abstract class BaseBinaryOperator<TInput, TOutput extends Number> implements IExpression<TInput, TOutput> {
	
	private IExpression<TInput, ? extends Number> left;
	private IExpression<TInput, ? extends Number> right;
	
	public BaseBinaryOperator(IExpression<TInput, ? extends Number> left, IExpression<TInput, ? extends Number> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IExpression<TInput, ? extends Number> getLeft() {
		return left;
	}
	
	public void setLeft(IExpression<TInput, ? extends Number> left) {
		this.left = left;
	}
	
	public IExpression<TInput, ? extends Number> getRight() {
		return right;
	}
	
	public void setRight(IExpression<TInput, ? extends Number> right) {
		this.right = right;
	}

}
