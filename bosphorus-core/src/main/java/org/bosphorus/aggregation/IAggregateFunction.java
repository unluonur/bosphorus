package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;

public interface IAggregateFunction<TInput, TOutput> {

	IAggregationBag<TInput, TOutput> newBag();
	
}
