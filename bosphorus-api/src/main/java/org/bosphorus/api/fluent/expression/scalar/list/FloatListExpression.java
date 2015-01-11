package org.bosphorus.api.fluent.expression.scalar.list;

import java.util.List;

import org.bosphorus.api.builder.expression.scalar.IScalarExpression1;
import org.bosphorus.api.fluent.expression.scalar.primitive.FloatExpression;

public class FloatListExpression<TInput> extends BaseNumberListExpression<TInput, Float, FloatExpression<TInput>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FloatListExpression(
			IScalarExpression1<TInput, List<Float>> builder) {
		super(builder);
	}

	@Override
	protected FloatExpression<TInput> create(
			IScalarExpression1<TInput, Float> expression) {
		return new FloatExpression<TInput>(expression);
	}
	
	public FloatExpression<TInput> sum() {
		return this.sumFloat();
	}

}
