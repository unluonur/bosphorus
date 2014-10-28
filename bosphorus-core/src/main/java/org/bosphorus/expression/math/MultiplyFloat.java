package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class MultiplyFloat extends BaseBinaryOperator<Float> {

	public MultiplyFloat(IExpression<Float> left,
			IExpression<Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) * this.getRight().execute(input);
	}

}
