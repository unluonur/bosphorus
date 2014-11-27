package org.bosphorus.expression.aggregate.factory.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.list.AggregationListExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class AggregationListFactory<TInput, TOutput> implements IAggregateExecutorFactory<TInput, List<TOutput>> {
	private List<IAggregateExecutorFactory<TInput, ? extends TOutput>> list;
	
	public AggregationListFactory(List<IAggregateExecutorFactory<TInput, ? extends TOutput>> list) {
		this.list = list;
	}

	@Override
	public IAggregateExecutor<TInput, List<TOutput>> create() {
		ArrayList<IAggregateExecutor<TInput, ? extends TOutput>> bags = new ArrayList<IAggregateExecutor<TInput, ? extends TOutput>>();
		for(IAggregateExecutorFactory<TInput, ? extends TOutput> factory: list) {
			bags.add(factory.create());
		}
		return new AggregationListExecutor<TInput, TOutput>(bags);
	}

}
