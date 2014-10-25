package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public abstract class BaseBinaryOperator<TType extends Number, TContext> implements IExpression<TType, TContext> {
	
	private IExpression<TType, TContext> left;
	private IExpression<TType, TContext> right;
	
	public BaseBinaryOperator(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IExpression<TType, TContext> getLeft() {
		return left;
	}
	
	public void setLeft(IExpression<TType, TContext> left) {
		this.left = left;
	}
	
	public IExpression<TType, TContext> getRight() {
		return right;
	}
	
	public void setRight(IExpression<TType, TContext> right) {
		this.right = right;
	}

}
