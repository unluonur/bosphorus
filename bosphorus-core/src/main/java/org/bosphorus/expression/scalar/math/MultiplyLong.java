package org.bosphorus.expression.scalar.math;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class MultiplyLong<TInput> implements IScalarExecutor<TInput, Long> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public MultiplyLong(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Long execute(TInput input) throws Exception {
		return left.execute(input).longValue() * right.execute(input).longValue();
	}

}
