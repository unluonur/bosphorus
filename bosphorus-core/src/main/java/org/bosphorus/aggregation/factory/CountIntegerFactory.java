package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountIntegerExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class CountIntegerFactory implements IAggregationFactory<Object, Integer> {

	@Override
	public IAggregationExecutor<Object, Integer> create() {
		return new CountIntegerExecutor();
	}
	
}
