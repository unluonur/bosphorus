package org.bosphorus.expression.batch;

import java.util.ArrayList;
import java.util.List;

public class SelectDistinctExecutor<TType extends Comparable<TType>> implements IBatchExecutor<TType, List<TType>> {
	private ArrayList<TType> list;

	public SelectDistinctExecutor() {
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
		return new ArrayList<TType>(list);
	}

	@Override
	public void reset() {
		list.clear();
	}

	@Override
	public Object getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Object state) {
		// TODO Auto-generated method stub
		
	}

}
