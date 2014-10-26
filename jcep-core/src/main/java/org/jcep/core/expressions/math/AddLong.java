package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddLong<TInput> extends BaseBinaryOperator<TInput, Long> {

	public AddLong(IExpression<TInput, Long> left,
			IExpression<TInput, Long> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TInput input) {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}
