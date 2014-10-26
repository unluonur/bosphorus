package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class MultiplyDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	public MultiplyDouble(IExpression<TInput, Double> left,
			IExpression<TInput, Double> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TInput input) {
		return this.getLeft().execute(input) * this.getRight().execute(input);
	}

}
