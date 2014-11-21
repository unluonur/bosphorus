package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class MultiplyFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public MultiplyFloat(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input).floatValue() * this.getRight().execute(input).floatValue();
	}

}
