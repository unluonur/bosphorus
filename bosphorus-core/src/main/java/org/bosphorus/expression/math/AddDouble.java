package org.bosphorus.expression.math;

import org.bosphorus.expression.IExpression;
import org.bosphorus.stream.ITuple;

public class AddDouble extends BaseBinaryOperator<Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5895203379539587045L;

	public AddDouble(IExpression<Double> left,
			IExpression<Double> right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public Double execute(ITuple input) throws Exception {
		return this.getLeft().execute(input) + this.getRight().execute(input);
	}

}
