package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;

public interface IAggregation<TInput, TOutput, TType> {

	IAggregationBag<TOutput, TType> newBag();
	
	void execute(TInput input, IAggregationBag<TOutput, TType> bag) throws Exception;

}
