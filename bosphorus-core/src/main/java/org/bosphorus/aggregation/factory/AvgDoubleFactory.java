package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgDoubleExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class AvgDoubleFactory<TInput> implements IAggregationFactory<Number, Double> {

	@Override
	public IAggregationExecutor<Number, Double> create() {
		return new AvgDoubleExecutor();
	}
	
}
