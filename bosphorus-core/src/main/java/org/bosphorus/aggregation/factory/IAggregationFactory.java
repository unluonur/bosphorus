package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;

public interface IAggregationFactory<TInput, TOutput> {

	IAggregationBag<TInput, TOutput> create();
	
}
