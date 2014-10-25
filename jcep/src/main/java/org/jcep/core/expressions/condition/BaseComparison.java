package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.common.IExpression;

public abstract class BaseComparison<TType extends Comparable<TType>, TContext> implements IExpression<Boolean, TContext> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1011658918506083769L;
	
	private IExpression<TType, TContext> left;
	private IExpression<TType, TContext> right;
	
	public BaseComparison() {
		
	}
	
	public BaseComparison(IExpression<TType, TContext> left, IExpression<TType, TContext> right) {
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
