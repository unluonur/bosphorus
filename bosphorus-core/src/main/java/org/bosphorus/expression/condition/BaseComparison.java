package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public abstract class BaseComparison<TType extends Comparable<TType>> implements IExpression<Boolean> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1011658918506083769L;
	
	private IExpression<TType> left;
	private IExpression<TType> right;
	
	public BaseComparison() {
		
	}
	
	public BaseComparison(IExpression<TType> left, IExpression<TType> right) {
		this.setLeft(left);
		this.setRight(right);
	}

	public IExpression<TType> getLeft() {
		return left;
	}

	public void setLeft(IExpression<TType> left) {
		this.left = left;
	}

	public IExpression<TType> getRight() {
		return right;
	}

	public void setRight(IExpression<TType> right) {
		this.right = right;
	}

}
