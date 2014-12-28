package org.bosphorus.expression.aggregate.executor.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class FirstNExecutor<TType> implements IAggregateExecutor<TType, List<TType>> {
	private List<TType> list;
	private Integer maxSize;
	
	public FirstNExecutor(Integer maxSize) {
		this.maxSize = maxSize;
		this.list = new ArrayList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(list.size() < maxSize) {
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
	public void setState(Object state) throws Exception {
		this.list = (List<TType>)state;
	}

}
