package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;

public interface IAggregation<TOutput> {

	IAggregationBag<TOutput> newBag();
	
}
