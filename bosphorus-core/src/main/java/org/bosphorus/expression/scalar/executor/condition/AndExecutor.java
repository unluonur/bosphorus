package org.bosphorus.expression.scalar.executor.condition;

import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class AndExecutor<TInput> extends BaseBinaryConditionExecutor<TInput> {

	public AndExecutor(IScalarExecutor<TInput, Boolean> left,
			IScalarExecutor<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) throws Exception {
		return this.getLeft().execute(input) && this.getRight().execute(input);
	}

}
