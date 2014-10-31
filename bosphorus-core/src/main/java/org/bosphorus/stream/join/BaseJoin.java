package org.bosphorus.stream.join;

import java.util.List;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.IStreamReader;

public abstract class BaseJoin<TInput> implements IStreamReader<List<TInput>> {
	private IStreamReader<List<TInput>> left;
	private IStreamReader<TInput> right;
	private IExpression<List<TInput>, Boolean> expression;
	
	public BaseJoin(IStreamReader<List<TInput>> left, IStreamReader<TInput> right, IExpression<List<TInput>, Boolean> expression) {
		this.setLeft(left);
		this.setRight(right);
		this.setExpression(expression);
	}
	
	public IStreamReader<List<TInput>> getLeft() {
		return left;
	}
	
	public void setLeft(IStreamReader<List<TInput>> left) {
		this.left = left;
	}
	
	public IStreamReader<TInput> getRight() {
		return right;
	}
	
	public void setRight(IStreamReader<TInput> right) {
		this.right = right;
	}

	public IExpression<List<TInput>, Boolean> getExpression() {
		return expression;
	}

	public void setExpression(IExpression<List<TInput>, Boolean> expression) {
		this.expression = expression;
	}

	@Override
	public List<TInput> read() throws Exception {
		throw new java.lang.UnsupportedOperationException();
	}
	
}
