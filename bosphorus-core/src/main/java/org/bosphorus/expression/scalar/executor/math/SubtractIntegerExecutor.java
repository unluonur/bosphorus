package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class SubtractIntegerExecutor<TInput> implements IScalarExecutor<TInput, Integer> {

	private IScalarExecutor<? super TInput, ? extends Number> left;
	private IScalarExecutor<? super TInput, ? extends Number> right;

	public SubtractIntegerExecutor(IScalarExecutor<? super TInput, ? extends Number> left,
			IScalarExecutor<? super TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Integer execute(TInput input) throws Exception {
		return left.execute(input).intValue() - right.execute(input).intValue();
	}

}
