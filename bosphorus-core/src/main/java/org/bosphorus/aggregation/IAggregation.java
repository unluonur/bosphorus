package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;

public interface IAggregation<TInput, TOutput, TType> {

	IAggregationBag<TOutput, TType> newBag();
	
	void execute(TInput input, IAggregationBag<TOutput, TType> bag) throws Exception;

}
