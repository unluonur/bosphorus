package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class SubtractDouble extends BaseBinaryOperator<Double> {

	public SubtractDouble(IExpression<Double> left,
			IExpression<Double> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) - this.getRight().execute(input);
	}

}
