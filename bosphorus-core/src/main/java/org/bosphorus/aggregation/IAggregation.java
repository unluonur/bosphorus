package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.stream.ITuple;

public interface IAggregation<TOutput, TType> {

	IAggregationBag<TOutput, TType> newBag();
	
	void execute(ITuple input, IAggregationBag<TOutput, TType> bag) throws Exception;

}
