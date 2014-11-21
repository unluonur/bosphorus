package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class AddLong<TInput> extends BaseBinaryOperator<TInput, Long> {

	public AddLong(IExpression<TInput, ? extends Number> left,
			IExpression<TInput, ? extends Number> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TInput input) throws Exception {
		return this.getLeft().execute(input).longValue() + this.getRight().execute(input).longValue();
	}

}
