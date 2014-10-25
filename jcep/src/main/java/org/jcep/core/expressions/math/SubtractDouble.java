package org.jcep.core.expressions.math;

import org.jcep.core.expressions.common.IExpression;

public class SubtractDouble<TContext> extends BaseBinaryOperator<Double, TContext> {

	public SubtractDouble(IExpression<Double, TContext> left,
			IExpression<Double, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TContext context) {
		return this.getLeft().execute(context) - this.getRight().execute(context);
	}

}
