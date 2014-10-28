package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class SubtractLong extends BaseBinaryOperator<Long> {

	public SubtractLong(IExpression<Long> left,
			IExpression<Long> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) - this.getRight().execute(input);
	}

}
