package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class AddLong<TInput> implements IScalarExecutor<TInput, Long> {

	private IScalarExecutor<? super TInput, ? extends Number> left;
	private IScalarExecutor<? super TInput, ? extends Number> right;

	public AddLong(IScalarExecutor<? super TInput, ? extends Number> left,
			IScalarExecutor<? super TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Long execute(TInput input) throws Exception {
		return left.execute(input).longValue() + right.execute(input).longValue();
	}

}
