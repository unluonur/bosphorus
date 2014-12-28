package org.bosphorus.expression.scalar.executor.math;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class AddFloatExecutor<TInput> implements IScalarExecutor<TInput, Float> {

	private IScalarExecutor<? super TInput, ? extends Number> left;
	private IScalarExecutor<? super TInput, ? extends Number> right;

	public AddFloatExecutor(IScalarExecutor<? super TInput, ? extends Number> left,
			IScalarExecutor<? super TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Float execute(TInput input) throws Exception {
		return left.execute(input).floatValue() + right.execute(input).floatValue();
	}

}
