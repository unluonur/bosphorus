package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumFloatExecutor;

public class SumFloatFactory implements IAggregationFactory<Number, Float> {

	@Override
	public IAggregationExecutor<Number, Float> create() {
		return new SumFloatExecutor();
	}

}
