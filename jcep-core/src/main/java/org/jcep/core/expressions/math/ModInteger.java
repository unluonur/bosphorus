package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class ModInteger<TInput> extends BaseBinaryOperator<TInput, Integer> {

	public ModInteger(IExpression<TInput, Integer> left,
			IExpression<TInput, Integer> right) {
		super(left, right);
	}

	public Integer execute(TInput input) {
		return this.getLeft().execute(input) % this.getRight().execute(input);
	}

}
