package org.bosphorus.api.builder.expression.aggregate.common;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.aggregate.factory.common.MinFactory;

public class MinExpression<TType extends Comparable<TType>> implements IAggregateExpression<TType, TType> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<TType, TType> build() {
		return new MinFactory<TType>();
	}

}
