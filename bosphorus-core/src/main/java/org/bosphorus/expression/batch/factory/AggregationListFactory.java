package org.bosphorus.expression.batch.factory;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.batch.BatchListExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;

public class AggregationListFactory<TInput, TOutput> implements IBatchExecutorFactory<TInput, List<TOutput>> {
	private List<IBatchExecutorFactory<TInput, ? extends TOutput>> list;
	
	public AggregationListFactory(List<IBatchExecutorFactory<TInput, ? extends TOutput>> list) {
		this.list = list;
	}

	@Override
	public IBatchExecutor<TInput, List<TOutput>> create() {
		ArrayList<IBatchExecutor<TInput, ? extends TOutput>> bags = new ArrayList<IBatchExecutor<TInput, ? extends TOutput>>();
		for(IBatchExecutorFactory<TInput, ? extends TOutput> factory: list) {
			bags.add(factory.create());
		}
		return new BatchListExecutor<TInput, TOutput>(bags);
	}

}
