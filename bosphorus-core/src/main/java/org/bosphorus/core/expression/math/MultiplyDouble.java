package org.bosphorus.core.expression.math;

import org.bosphorus.core.expression.IExpression;

public class MultiplyDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	public MultiplyDouble(IExpression<TInput, Double> left,
			IExpression<TInput, Double> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TInput input) throws Exception {
		return this.getLeft().execute(input) * this.getRight().execute(input);
	}

}
