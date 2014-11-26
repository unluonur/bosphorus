package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountDistinctExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;

public class CountDistinctFactory<TType extends Comparable<TType>> implements IAggregationFactory<TType, Integer> {

	@Override
	public IAggregationExecutor<TType, Integer> create() {
		return new CountDistinctExecutor<TType>();
	}

}
