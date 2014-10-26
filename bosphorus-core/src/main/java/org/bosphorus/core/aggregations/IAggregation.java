package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;

public interface IAggregation<TInput, TOutput, TType> {

	IAggregationBag<TOutput, TType> newBag();
	
	void execute(TInput input, IAggregationBag<TOutput, TType> bag) throws Exception;

}
