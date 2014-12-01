package org.bosphorus.api.builder.expression.scalar.condition;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;

public abstract class BaseComparisonExpression<TInput, TType extends Comparable<TType>> implements IScalarExpression<TInput, Boolean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private IScalarExpression<TInput, TType> left;
	private IScalarExpression<TInput, TType> right;
	
	public BaseComparisonExpression(IScalarExpression<TInput, TType> left, IScalarExpression<TInput, TType> right) {
		this.setLeft(left);
		this.setRight(right);
	}
	
	public IScalarExpression<TInput, TType> getLeft() {
		return left;
	}
	
	public void setLeft(IScalarExpression<TInput, TType> left) {
		this.left = left;
	}
	
	public IScalarExpression<TInput, TType> getRight() {
		return right;
	}
	
	public void setRight(IScalarExpression<TInput, TType> right) {
		this.right = right;
	}
}
