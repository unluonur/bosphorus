package org.bosphorus.expression.batch;

import java.util.ArrayList;

public class CountDistinctExecutor<TType extends Comparable<TType>> implements IBatchExecutor<TType, Integer> {
	private ArrayList<Integer> list;

	public CountDistinctExecutor() {
		this.list = new ArrayList<Integer>();
	}

	@Override
	public void execute(TType input) throws Exception {
		Integer hashCode = input.hashCode();
		if(!list.contains(hashCode)) {
			list.add(hashCode);
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
	public void setState(Object state) {
		this.list = (ArrayList<Integer>)state;
	}

}
