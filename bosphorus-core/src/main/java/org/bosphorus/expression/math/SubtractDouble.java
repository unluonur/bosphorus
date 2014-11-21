package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class SubtractDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	public SubtractDouble(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TInput input) throws Exception {
		return this.getLeft().execute(input).doubleValue() - this.getRight().execute(input).doubleValue();
	}

}
