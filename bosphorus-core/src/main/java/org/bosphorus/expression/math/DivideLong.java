package org.bosphorus.expression.math;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class DivideLong extends BaseBinaryOperator<Long> {

	public DivideLong(IExpression<Long> left,
			IExpression<Long> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) / this.getRight().execute(input);
	}

}
