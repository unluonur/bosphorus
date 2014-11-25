package org.bosphorus.aggregation.factory;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.AggregationListExecutor;

public class AggregationListFactory<TInput, TOutput> implements IAggregationFactory<TInput, List<TOutput>> {
	private List<IAggregationFactory<TInput, ? extends TOutput>> list;
	
	public AggregationListFactory(List<IAggregationFactory<TInput, ? extends TOutput>> list) {
		this.list = list;
	}

	@Override
	public IAggregationExecutor<TInput, List<TOutput>> create() {
		ArrayList<IAggregationExecutor<TInput, ? extends TOutput>> bags = new ArrayList<IAggregationExecutor<TInput, ? extends TOutput>>();
		for(IAggregationFactory<TInput, ? extends TOutput> factory: list) {
			bags.add(factory.create());
		}
		return new AggregationListExecutor<TInput, TOutput>(bags);
	}

}
