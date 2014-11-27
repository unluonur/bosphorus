package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class SubtractLong<TInput> implements IScalarExecutor<TInput, Long> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public SubtractLong(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Long execute(TInput input) throws Exception {
		return left.execute(input).longValue() - right.execute(input).longValue();
	}

}
