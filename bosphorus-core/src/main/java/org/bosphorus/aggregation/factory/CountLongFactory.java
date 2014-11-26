package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountLongExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class CountLongFactory implements IAggregationFactory<Object, Long> {

	@Override
	public IAggregationExecutor<Object, Long> create() {
		return new CountLongExecutor();
	}
	
}
