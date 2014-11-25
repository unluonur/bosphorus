package org.bosphorus.aggregation.executor;

public interface IAggregationExecutor<TInput, TOutput> {
	
	void execute(TInput input) throws Exception;
	TOutput getValue();
	void reset();
	
}
