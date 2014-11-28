package org.bosphorus.api.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.expression.scalar.IScalarExpression;
import org.bosphorus.api.expression.scalar.type.primitive.DoubleExpression;

public class DoubleListExpression<TInput> extends BaseNumberListExpression<TInput, Double, DoubleExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoubleListExpression(
			IScalarExpression<TInput, List<Double>> builder) {
		super(builder);
	}

	@Override
	protected DoubleExpression<TInput> create(IScalarExpression<TInput, Double> expression) {
		return new DoubleExpression<TInput>(expression);
	}

}
