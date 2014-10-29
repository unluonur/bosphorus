package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public abstract class BaseBinaryOperator<TInput, TOutput extends Number> implements IExpression<TInput, TOutput> {
	
	private IExpression<TInput, TOutput> left;
	private IExpression<TInput, TOutput> right;
	
	public BaseBinaryOperator(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IExpression<TInput, TOutput> getLeft() {
		return left;
	}
	
	public void setLeft(IExpression<TInput, TOutput> left) {
		this.left = left;
	}
	
	public IExpression<TInput, TOutput> getRight() {
		return right;
	}
	
	public void setRight(IExpression<TInput, TOutput> right) {
		this.right = right;
	}

}
