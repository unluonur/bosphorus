package org.bosphorus.expression.aggregate.factory;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public interface IAggregateExecutorFactory<TInput, TOutput> {

	IAggregateExecutor<TInput, TOutput> create();
	
}
