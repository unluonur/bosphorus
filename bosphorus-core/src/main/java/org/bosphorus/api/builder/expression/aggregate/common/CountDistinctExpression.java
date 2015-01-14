package org.bosphorus.api.builder.expression.aggregate.common;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.aggregate.factory.common.CountDistinctFactory;

public class CountDistinctExpression<TType extends Comparable<TType>> implements IAggregateExpression<TType, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<TType, Integer> build() {
		return new CountDistinctFactory<TType>();
	}


}
