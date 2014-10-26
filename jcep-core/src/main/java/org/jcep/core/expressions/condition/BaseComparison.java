package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public abstract class BaseComparison<TInput, TOutput extends Comparable<TOutput>> implements IExpression<TInput, Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1011658918506083769L;
	
	private IExpression<TInput, TOutput> left;
	private IExpression<TInput, TOutput> right;
	
	public BaseComparison() {
		
	}
	
	public BaseComparison(IExpression<TInput, TOutput> left, IExpression<TInput, TOutput> right) {
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
