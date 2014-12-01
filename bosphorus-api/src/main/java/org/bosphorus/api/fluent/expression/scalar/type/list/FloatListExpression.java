package org.bosphorus.api.fluent.expression.scalar.type.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression;
import org.bosphorus.api.fluent.expression.scalar.type.primitive.FloatExpression;

public class FloatListExpression<TInput> extends BaseNumberListExpression<TInput, Float, FloatExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FloatListExpression(
			IScalarExpression<TInput, List<? extends Float>> builder) {
		super(builder);
	}

	@Override
	protected FloatExpression<TInput> create(
			IScalarExpression<TInput, Float> expression) {
		return new FloatExpression<TInput>(expression);
	}

}
