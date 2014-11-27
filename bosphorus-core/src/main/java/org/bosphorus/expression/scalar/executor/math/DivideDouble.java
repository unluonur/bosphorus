package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class DivideDouble<TInput> implements IScalarExecutor<TInput, Double> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public DivideDouble(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Double execute(TInput input) throws Exception {
		return left.execute(input).doubleValue() / right.execute(input).doubleValue();
	}

}
