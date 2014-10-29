package org.bosphorus.expression.math;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class ModInteger extends BaseBinaryOperator<Integer> {

	public ModInteger(IExpression<Integer> left,
			IExpression<Integer> right) {
		super(left, right);
	}

	public Integer execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) % this.getRight().execute(input);
	}

}
