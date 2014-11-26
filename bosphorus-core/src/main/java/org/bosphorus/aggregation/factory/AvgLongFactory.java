package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgLongExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class AvgLongFactory implements IAggregationFactory<Number, Long> {

	@Override
	public IAggregationExecutor<Number, Long> create() {
		return new AvgLongExecutor();
	}

}
