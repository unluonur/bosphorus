package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class AddDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	public AddDouble(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
	}

	public Double execute(TInput input) throws Exception {
		return this.getLeft().execute(input).doubleValue() + this.getRight().execute(input).doubleValue();
	}

}
