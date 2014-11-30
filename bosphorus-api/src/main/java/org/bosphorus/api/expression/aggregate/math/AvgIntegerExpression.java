package org.bosphorus.api.expression.aggregate.math;

import org.bosphorus.api.expression.aggregate.IAggregateExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.math.AvgIntegerFactory;

public class AvgIntegerExpression implements IAggregateExpression<Number, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<Number, Integer> build() {
		return new AvgIntegerFactory();
	}

}
