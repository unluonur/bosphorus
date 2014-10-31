package org.bosphorus.aggregation.bag;

public interface IAggregationBag<TInput, TOutput> {
	
	void execute(TInput input) throws Exception;
	TOutput getValue();
	
}
