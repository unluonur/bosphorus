package org.jcep.core.expressions.math;

import org.jcep.core.expressions.common.IExpression;

public class MultiplyLong<TContext> extends BaseBinaryOperator<Long, TContext> {

	public MultiplyLong(IExpression<Long, TContext> left,
			IExpression<Long, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TContext context) {
		return this.getLeft().execute(context) * this.getRight().execute(context);
	}

}
