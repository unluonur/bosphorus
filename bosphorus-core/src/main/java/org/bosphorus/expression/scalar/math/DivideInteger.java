package org.bosphorus.expression.scalar.math;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class DivideInteger<TInput> implements IScalarExecutor<TInput, Integer> {

	private IScalarExecutor<TInput, ? extends Number> left;
	private IScalarExecutor<TInput, ? extends Number> right;

	public DivideInteger(IScalarExecutor<TInput, ? extends Number> left,
			IScalarExecutor<TInput, ? extends Number> right) {
		this.left = left;
		this.right = right;
	}

	public Integer execute(TInput input) throws Exception {
		return left.execute(input).intValue() / right.execute(input).intValue();
	}

}
