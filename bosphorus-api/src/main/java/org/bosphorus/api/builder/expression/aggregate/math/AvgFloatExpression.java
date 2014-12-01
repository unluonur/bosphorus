package org.bosphorus.api.builder.expression.aggregate.math;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.math.AvgFloatFactory;

public class AvgFloatExpression implements IAggregateExpression<Number, Float> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<Number, Float> build() {
		return new AvgFloatFactory();
	}

}
