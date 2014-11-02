package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;

public class DivideLong<TInput> extends BaseBinaryOperator<TInput, Long> {

	public DivideLong(IExpression<TInput, Long> left,
			IExpression<TInput, Long> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TInput input) throws Exception {
		return this.getLeft().execute(input) / this.getRight().execute(input);
	}

}
