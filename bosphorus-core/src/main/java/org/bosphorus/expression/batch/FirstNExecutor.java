package org.bosphorus.expression.batch;

import java.util.ArrayList;
import java.util.List;

public class FirstNExecutor<TType> implements IBatchExecutor<TType, List<TType>> {
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
