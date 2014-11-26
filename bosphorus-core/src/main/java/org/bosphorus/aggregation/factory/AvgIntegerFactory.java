package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgIntegerExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class AvgIntegerFactory implements IAggregationFactory<Number, Integer> {

	@Override
	public IAggregationExecutor<Number, Integer> create() {
		return new AvgIntegerExecutor();
	}

}
