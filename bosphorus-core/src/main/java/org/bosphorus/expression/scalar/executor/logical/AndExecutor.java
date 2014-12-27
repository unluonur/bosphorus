package org.bosphorus.expression.scalar.executor.logical;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class AndExecutor<TInput> implements IScalarExecutor<TInput, Boolean> {

	private IScalarExecutor<? super TInput, Boolean> left;
	private IScalarExecutor<? super TInput, Boolean> right;
	
	public AndExecutor(IScalarExecutor<? super TInput, Boolean> left,
			IScalarExecutor<? super TInput, Boolean> right) {
		this.left = left;
		this.right = right;
	}

	public Boolean execute(TInput input) throws Exception {
		return left.execute(input) && right.execute(input);
	}

}
