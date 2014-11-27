package org.bosphorus.expression.aggregate.factory.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.common.CountDistinctExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class CountDistinctFactory<TType extends Comparable<TType>> implements IAggregateExecutorFactory<TType, Integer> {

	@Override
	public IAggregateExecutor<TType, Integer> create() {
		return new CountDistinctExecutor<TType>();
	}

}
