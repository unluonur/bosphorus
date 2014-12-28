package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class SubtractDoubleExecutor<TInput> implements IScalarExecutor<TInput, Double> {

	private IScalarExecutor<? super TInput, ? extends Number> left;
	private IScalarExecutor<? super TInput, ? extends Number> right;

	public SubtractDoubleExecutor(IScalarExecutor<? super TInput, ? extends Number> left,
			IScalarExecutor<? super TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Double execute(TInput input) throws Exception {
		return left.execute(input).doubleValue() - right.execute(input).doubleValue();
	}

}
