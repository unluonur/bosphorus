package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddInteger<TContext> extends BaseBinaryOperator<Integer, TContext> {

	public AddInteger(IExpression<Integer, TContext> left,
			IExpression<Integer, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Integer execute(TContext context) {
		return this.getLeft().execute(context) + this.getRight().execute(context);
	}

}
