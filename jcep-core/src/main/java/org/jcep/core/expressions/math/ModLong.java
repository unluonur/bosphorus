package org.jcep.core.expressions.math;

import org.jcep.core.expressions.common.IExpression;

public class ModLong<TContext> extends BaseBinaryOperator<Long, TContext> {

	public ModLong(IExpression<Long, TContext> left,
			IExpression<Long, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Long execute(TContext context) {
		return this.getLeft().execute(context) % this.getRight().execute(context);
	}

}
