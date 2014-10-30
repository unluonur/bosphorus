package org.bosphorus.query.aggregation.function;

import org.bosphorus.query.aggregation.bag.IAggregationBag;

public interface IAggregateFunction<TInput, TOutput> {

	IAggregationBag<TInput, TOutput> newBag();
	
}
