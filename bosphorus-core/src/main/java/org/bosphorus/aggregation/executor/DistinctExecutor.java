package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.List;

public class DistinctExecutor<TType> implements IAggregationExecutor<TType, List<TType>> {
	private ArrayList<TType> list;

	public DistinctExecutor() {
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(!list.contains(input)) {
			list.add(input);
		}
	}

	@Override
	public List<TType> getValue() {
		return list;
	}

	@Override
	public void reset() {
		list.clear();
	}

}
