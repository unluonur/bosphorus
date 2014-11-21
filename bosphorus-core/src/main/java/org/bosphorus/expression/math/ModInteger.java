package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class ModInteger<TInput> extends BaseBinaryOperator<TInput, Integer> {

	public ModInteger(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
	}

	public Integer execute(TInput input) throws Exception {
		return this.getLeft().execute(input).intValue() % this.getRight().execute(input).intValue();
	}

}
