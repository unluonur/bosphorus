package org.bosphorus.api.builder.expression.aggregate.math;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.math.AvgLongFactory;

public class AvgLongExpression implements IAggregateExpression<Number, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<Number, Long> build() {
		return new AvgLongFactory();
	}

}
