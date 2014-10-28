package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class MultiplyInteger extends BaseBinaryOperator<Integer> {

	public MultiplyInteger(IExpression<Integer> left,
			IExpression<Integer> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Integer execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) * this.getRight().execute(input);
	}

}
