package org.bosphorus.core.expressions.math;

import org.bosphorus.core.expressions.IExpression;

public class ModInteger<TInput> extends BaseBinaryOperator<TInput, Integer> {

	public ModInteger(IExpression<TInput, Integer> left,
			IExpression<TInput, Integer> right) {
		super(left, right);
	}

	public Integer execute(TInput input) throws Exception {
		return this.getLeft().execute(input) % this.getRight().execute(input);
	}

}
