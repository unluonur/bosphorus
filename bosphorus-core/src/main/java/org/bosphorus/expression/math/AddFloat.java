package org.bosphorus.expression.math;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AddFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public AddFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}
