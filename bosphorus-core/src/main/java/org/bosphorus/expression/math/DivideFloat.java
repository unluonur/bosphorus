package org.bosphorus.expression.math;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class DivideFloat extends BaseBinaryOperator<Float> {

	public DivideFloat(IExpression<Float> left,
			IExpression<Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) / this.getRight().execute(input);
	}

}
