package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgFloatExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class AvgFloatFactory implements IAggregationFactory<Number, Float> {

	@Override
	public IAggregationExecutor<Number, Float> create() {
		return new AvgFloatExecutor();
	}

}
