package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public AddFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}
