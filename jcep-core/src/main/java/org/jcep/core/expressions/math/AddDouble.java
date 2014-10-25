package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddDouble<TContext> extends BaseBinaryOperator<Double, TContext> {

	public AddDouble(IExpression<Double, TContext> left,
			IExpression<Double, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TContext context) {
		return this.getLeft().execute(context) + this.getRight().execute(context);
	}

}
