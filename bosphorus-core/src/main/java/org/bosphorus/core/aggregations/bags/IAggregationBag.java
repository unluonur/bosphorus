package org.bosphorus.core.aggregations.bags;

public interface IAggregationBag<TOutput, TType> {
	
	void execute(TType value);
	TOutput value();
	
}
