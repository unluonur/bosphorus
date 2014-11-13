package org.bosphorus.stream.join;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.pipe.IReader;

public abstract class BaseJoin<TInput> implements IReader<List<TInput>> {
	private IReader<List<TInput>> left;
	private IReader<TInput> right;
	private IExpression<List<TInput>, Boolean> expression;
	
	public BaseJoin(IReader<List<TInput>> left, IReader<TInput> right, IExpression<List<TInput>, Boolean> expression) {
		this.setLeft(left);
		this.setRight(right);
		this.setExpression(expression);
	}
	
	public IReader<List<TInput>> getLeft() {
		return left;
	}
	
	public void setLeft(IReader<List<TInput>> left) {
		this.left = left;
	}
	
	public IReader<TInput> getRight() {
		return right;
	}
	
	public void setRight(IReader<TInput> right) {
		this.right = right;
	}

	public IExpression<List<TInput>, Boolean> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<List<TInput>, Boolean> expression) {
		this.expression = expression;
	}
	
}
