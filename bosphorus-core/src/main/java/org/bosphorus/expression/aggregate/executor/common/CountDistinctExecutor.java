package org.bosphorus.expression.aggregate.executor.common;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class CountDistinctExecutor<TType extends Comparable<TType>> implements IAggregateExecutor<TType, Integer> {
	private List<Integer> list;

	public CountDistinctExecutor() {
		this.list = new ArrayList<Integer>();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(input != null) {
			Integer hashCode = input.hashCode();
			if(!list.contains(hashCode)) {
				list.add(hashCode);
			}
		}
	}

	@Override
	public Integer getValue() {
		return list.size();
	}

	@Override
	public void reset() {
		list.clear();
	}

	@Override
	public Object getState() {
		return this.list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.list = (List<Integer>)state;
	}

}
