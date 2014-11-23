package org.bosphorus.expression.condition;

import org.bosphorus.expression.IExpression;

public abstract class BaseComparison<TInput, TType extends Comparable<TType>> implements IExpression<TInput, Boolean> {
	
	private IExpression<TInput, TType> left;
	private IExpression<TInput, TType> right;

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
