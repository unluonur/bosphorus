package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumLongExecutor;

public class SumLongFactory<TInput> implements IAggregationFactory<Number, Long> {

	@Override
	public IAggregationExecutor<Number, Long> create() {
		return new SumLongExecutor();
	}

}
