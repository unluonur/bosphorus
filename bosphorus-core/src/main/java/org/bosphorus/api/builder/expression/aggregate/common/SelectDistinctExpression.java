package org.bosphorus.api.builder.expression.aggregate.common;

import java.util.List;

import org.bosphorus.api.builder.expression.aggregate.IAggregateExpression;
import org.bosphorus.core.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.core.expression.aggregate.factory.common.SelectDistinctFactory;

public class SelectDistinctExpression<TType extends Comparable<TType>> implements IAggregateExpression<TType, List<TType>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public IAggregateExecutorFactory<TType, List<TType>> build() {
		return new SelectDistinctFactory<TType>();
	}

}
