package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class ModInteger<TContext> extends BaseBinaryOperator<Integer, TContext> {

	public ModInteger(IExpression<Integer, TContext> left,
			IExpression<Integer, TContext> right) {
		super(left, right);
	}

	public Integer execute(TContext context) {
		return this.getLeft().execute(context) % this.getRight().execute(context);
	}

}
