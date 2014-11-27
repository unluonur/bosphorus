package org.bosphorus.expression.aggregate.factory.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.common.CountLongExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class CountLongFactory implements IAggregateExecutorFactory<Object, Long> {

	@Override
	public IAggregateExecutor<Object, Long> create() {
		return new CountLongExecutor();
	}
	
}
