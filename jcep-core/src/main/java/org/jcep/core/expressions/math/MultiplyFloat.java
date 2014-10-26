package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class MultiplyFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public MultiplyFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input) * this.getRight().execute(input);
	}

}
