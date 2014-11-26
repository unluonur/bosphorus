package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.MaxExecutor;

public class MaxFactory<TType extends Comparable<TType>> implements IAggregationFactory<TType, TType> {

	@Override
	public IAggregationExecutor<TType, TType> create() {
		return new MaxExecutor<TType>();
	}

}
