package org.bosphorus.stream.batch.join;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.batch.IReader;

public abstract class BaseJoin<TInput> implements IReader<List<List<TInput>>> {
	private IReader<List<List<TInput>>> left;
	private IReader<List<TInput>> right;
	private IExpression<List<TInput>, Boolean> expression;
	
	public BaseJoin(IReader<List<List<TInput>>> left, IReader<List<TInput>> right, IExpression<List<TInput>, Boolean> expression) {
		this.setLeft(left);
		this.setRight(right);
		this.setExpression(expression);
	}
	
	public IReader<List<List<TInput>>> getLeft() {
		return left;
	}
	
	public void setLeft(IReader<List<List<TInput>>> left) {
		this.left = left;
	}
	
	public IReader<List<TInput>> getRight() {
		return right;
	}
	
	public void setRight(IReader<List<TInput>> right) {
		this.right = right;
	}

	public IExpression<List<TInput>, Boolean> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<List<TInput>, Boolean> expression) {
		this.expression = expression;
	}
	
}
