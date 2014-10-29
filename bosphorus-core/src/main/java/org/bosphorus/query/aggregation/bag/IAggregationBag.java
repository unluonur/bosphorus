package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;

public interface IAggregationBag<TOutput> {
	
	void execute(ITuple input) throws Exception;
	TOutput getValue();
	
}
