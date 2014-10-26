package org.bosphorus.core.aggregations.bags;

import java.util.ArrayList;

public class CountDistinctBag<TType extends Comparable<TType>> implements IAggregationBag<Integer, TType> {
	private ArrayList<TType> list;
	
	public CountDistinctBag() {
		this.list = new ArrayList<TType>();
	}
	
	@Override
	public void execute(TType value) {
		if(!this.list.contains(value)) {
			this.list.add(value);
		}
	}

	@Override
	public Integer value() {
		return this.list.size();
	}

}
