package org.bosphorus.expression.batch;

import java.util.ArrayList;
import java.util.List;

public class SelectExecutor<TType> implements IBatchExecutor<TType, List<TType>> {
	private ArrayList<TType> list;

	public SelectExecutor() {
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		list.add(input);
	}

	@Override
	public List<TType> getValue() {
		return new ArrayList<TType>(list);
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
		this.list = (ArrayList<TType>)state;
	}

}
