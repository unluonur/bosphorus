package org.bosphorus.expression.aggregate.factory.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.common.CountIntegerExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class CountIntegerFactory implements IAggregateExecutorFactory<Object, Integer> {

	@Override
	public IAggregateExecutor<Object, Integer> create() {
		return new CountIntegerExecutor();
	}
	
}
