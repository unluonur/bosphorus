package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class SubtractInteger<TInput> extends BaseBinaryOperator<TInput, Integer> {

	public SubtractInteger(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Integer execute(TInput input) throws Exception {
		return this.getLeft().execute(input).intValue() - this.getRight().execute(input).intValue();
	}

}
