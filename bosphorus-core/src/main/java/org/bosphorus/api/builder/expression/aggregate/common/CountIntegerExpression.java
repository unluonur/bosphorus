package org.bosphorus.api.builder.expression.aggregate.common;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.aggregate.factory.common.CountIntegerFactory;

public class CountIntegerExpression implements IAggregateExpression<Object, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<Object, Integer> build() {
		return new CountIntegerFactory();
	}


}
