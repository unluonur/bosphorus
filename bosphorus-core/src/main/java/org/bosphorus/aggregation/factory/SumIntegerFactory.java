package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumIntegerExecutor;

public class SumIntegerFactory<TInput> implements IAggregationFactory<Number, Integer> {

	@Override
	public IAggregationExecutor<Number, Integer> create() {
		return new SumIntegerExecutor();
	}

}
