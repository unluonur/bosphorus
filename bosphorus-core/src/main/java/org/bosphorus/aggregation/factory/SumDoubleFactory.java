package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumDoubleExecutor;

public class SumDoubleFactory implements IAggregationFactory<Number, Double> {

	@Override
	public IAggregationExecutor<Number, Double> create() {
		return new SumDoubleExecutor();
	}

}
