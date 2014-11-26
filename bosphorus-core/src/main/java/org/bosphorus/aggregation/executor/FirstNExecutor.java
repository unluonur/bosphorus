package org.bosphorus.aggregation.executor;

import java.util.ArrayList;
import java.util.List;

public class FirstNExecutor<TType> implements IAggregationExecutor<TType, List<TType>> {
	private ArrayList<TType> list;
	private Integer maxSize;
	
	public FirstNExecutor(Integer maxSize) {
		this.maxSize = maxSize;
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(list.size()<maxSize) {
			list.add(input);
		}
	}

	@Override
	public List<TType> getValue() {
		return new ArrayList<TType>(list);
	}

	@Override
	public void reset() {
		list.clear();
	}

}
