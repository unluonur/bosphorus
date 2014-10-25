package org.jcep.core.expressions.math;

import org.jcep.core.expressions.common.IExpression;

public class DivideFloat<TContext> extends BaseBinaryOperator<Float, TContext> {

	public DivideFloat(IExpression<Float, TContext> left,
			IExpression<Float, TContext> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TContext context) {
		return this.getLeft().execute(context) / this.getRight().execute(context);
	}

}