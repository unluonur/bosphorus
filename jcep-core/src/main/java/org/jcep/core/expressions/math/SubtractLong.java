package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class SubtractLong<TInput> extends BaseBinaryOperator<TInput, Long> {

	public SubtractLong(IExpression<TInput, Long> left,
			IExpression<TInput, Long> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TInput input) throws Exception {
		return this.getLeft().execute(input) - this.getRight().execute(input);
	}

}
