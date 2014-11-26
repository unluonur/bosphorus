package org.bosphorus.expression.scalar.math;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class AddFloat<TInput> implements IScalarExecutor<TInput, Float> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public AddFloat(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Float execute(TInput input) throws Exception {
		return left.execute(input).floatValue() + right.execute(input).floatValue();
	}

}
