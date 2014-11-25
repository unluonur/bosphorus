package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;

public interface IAggregationFactory<TInput, TOutput> {

	IAggregationExecutor<TInput, TOutput> create();
	
}
