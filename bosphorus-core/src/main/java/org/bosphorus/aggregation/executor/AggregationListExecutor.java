package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.List;

public class AggregationListExecutor<TInput, TOutput> implements IAggregationExecutor<TInput, List<TOutput>> {
	private List<IAggregationExecutor<TInput, ? extends TOutput>> list;
	
	public AggregationListExecutor(List<IAggregationExecutor<TInput, ? extends TOutput>> list) {
		this.list = list;
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IAggregationExecutor<TInput, ? extends TOutput> bag: list) {
			bag.execute(input);
		}
	}

	@Override
	public List<TOutput> getValue() {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IAggregationExecutor<TInput, ? extends TOutput> bag: list) {
			result.add(bag.getValue());
		}
		return result;
	}

	@Override
	public void reset() {
		for(IAggregationExecutor<? extends TInput, ? extends TOutput> bag: list) {
			bag.reset();
		}
	}

}
