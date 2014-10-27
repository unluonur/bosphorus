package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class SubtractFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public SubtractFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input) - this.getRight().execute(input);
	}

}
