package org.bosphorus.expression.scalar.condition;

import org.bosphorus.expression.scalar.IScalarExecutor;

public class And<TInput> extends BaseBinaryCondition<TInput> {

	public And(IScalarExecutor<TInput, Boolean> left,
			IScalarExecutor<TInput, Boolean> right) {
		super(left, right);
	}

	public Boolean execute(TInput input) throws Exception {
		return this.getLeft().execute(input) && this.getRight().execute(input);
	}

}
