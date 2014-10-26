package org.bosphorus.core.expression.math;

import org.bosphorus.core.expression.IExpression;

public class DivideFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public DivideFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input) / this.getRight().execute(input);
	}

}
