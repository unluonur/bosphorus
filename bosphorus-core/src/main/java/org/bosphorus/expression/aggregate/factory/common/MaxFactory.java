package org.bosphorus.expression.aggregate.factory.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.common.MaxExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class MaxFactory<TType extends Comparable<TType>> implements IAggregateExecutorFactory<TType, TType> {

	@Override
	public IAggregateExecutor<TType, TType> create() {
		return new MaxExecutor<TType>();
	}

}
