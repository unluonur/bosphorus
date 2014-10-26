package org.bosphorus.core.aggregation.bag;

public interface IAggregationBag<TOutput, TType> {
	
	void execute(TType value);
	TOutput value();
	
}
