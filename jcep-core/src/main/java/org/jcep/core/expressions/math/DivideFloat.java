package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class DivideFloat<TInput> extends BaseBinaryOperator<TInput, Float> {

	public DivideFloat(IExpression<TInput, Float> left,
			IExpression<TInput, Float> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Float execute(TInput input) throws Exception {
		return this.getLeft().execute(input) / this.getRight().execute(input);
	}

}
