package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class AndExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<TInput, Boolean> left;
	private IScalarExecutor<TInput, Boolean> right;
	
	public AndExecutor(IScalarExecutor<TInput, Boolean> left,
			IScalarExecutor<TInput, Boolean> right) {
		this.left = left;
		this.right = right;
	}

	public Boolean execute(TInput input) throws Exception {
		return left.execute(input) && right.execute(input);
	}

}
