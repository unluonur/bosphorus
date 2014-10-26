package org.jcep.core.expressions.condition;

import org.jcep.core.expressions.IExpression;

public abstract class BaseComparison<TInput, TType extends Comparable<TType>> implements IExpression<TInput, Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1011658918506083769L;
	
	private IExpression<TInput, TType> left;
	private IExpression<TInput, TType> right;
	
	public BaseComparison() {
		
	}
	
	public BaseComparison(IExpression<TInput, TType> left, IExpression<TInput, TType> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IExpression<TInput, TType> getLeft() {
		return left;
	}

	public void setLeft(IExpression<TInput, TType> left) {
		this.left = left;
	}

	public IExpression<TInput, TType> getRight() {
		return right;
	}

	public void setRight(IExpression<TInput, TType> right) {
		this.right = right;
	}

}
