package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class DivideDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	public DivideDouble(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, Double> right) {
		super(left, right);
	}

	public Double execute(TInput input) throws Exception {
		return this.getLeft().execute(input).doubleValue() / this.getRight().execute(input).doubleValue();
	}

}
