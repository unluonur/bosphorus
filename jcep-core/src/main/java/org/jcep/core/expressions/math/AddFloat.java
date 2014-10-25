package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddFloat<TContext> extends BaseBinaryOperator<Float, TContext> {

	public AddFloat(IExpression<Float, TContext> left,
			IExpression<Float, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TContext context) {
		return this.getLeft().execute(context) + this.getRight().execute(context);
	}

}
