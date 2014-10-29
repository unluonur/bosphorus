package org.bosphorus.query.aggregation;

import org.bosphorus.query.aggregation.bag.IAggregationBag;

public interface IAggregation<TInput, TOutput> {

	IAggregationBag<TInput, TOutput> newBag();
	
}
