package org.bosphorus.expression.scalar.math;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class MultiplyFloat<TInput> implements IScalarExecutor<TInput, Float> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public MultiplyFloat(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Float execute(TInput input) throws Exception {
		return left.execute(input).floatValue() * right.execute(input).floatValue();
	}

}
