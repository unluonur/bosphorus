package org.jcep.core.expressions.math;

import org.jcep.core.expressions.IExpression;

public class AddDouble<TInput> extends BaseBinaryOperator<TInput, Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5895203379539587045L;

	public AddDouble(IExpression<TInput, Double> left,
			IExpression<TInput, Double> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(TInput input) throws Exception {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}
