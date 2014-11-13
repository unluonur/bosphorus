package org.bosphorus.pipe;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.aggregation.IAggregateFunction;
import org.bosphorus.aggregation.bag.IAggregationBag;

public class NonGroupAggregation<TInput> extends BaseSyncPipe<TInput> implements IReader<List<Object>> {
	
	private ArrayList<IAggregationBag<TInput, ?>> bags;
	
	public NonGroupAggregation(List<IAggregateFunction<TInput, ?>> expressions) {
		bags = new ArrayList<IAggregationBag<TInput, ?>>();
		for(IAggregateFunction<TInput, ?> expr: expressions) {
			bags.add(expr.newBag());
		}
	}

	@Override
	public List<List<Object>> read() throws Exception {
		synchronized (lockObject) {
			ArrayList<Object> tuple = new ArrayList<Object>();
			for(IAggregationBag<TInput, ?> bag: bags) {
				tuple.add(bag.getValue());
				bag.reset();
			}
			ArrayList<List<Object>> result = new ArrayList<List<Object>>();
			result.add(tuple);
			return result;
		}
	}
	
	@Override
	protected void process(TInput input) throws Exception {
		for(IAggregationBag<TInput, ?> bag: bags) {
			bag.execute(input);
		}
	}
}
