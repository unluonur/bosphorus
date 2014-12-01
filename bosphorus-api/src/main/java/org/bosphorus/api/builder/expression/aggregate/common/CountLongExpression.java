package org.bosphorus.api.builder.expression.aggregate.common;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.aggregate.factory.common.CountLongFactory;

public class CountLongExpression implements IAggregateExpression<Object, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<Object, Long> build() {
		return new CountLongFactory();
	}

}
