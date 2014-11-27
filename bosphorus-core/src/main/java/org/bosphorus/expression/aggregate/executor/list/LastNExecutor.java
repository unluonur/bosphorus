package org.bosphorus.expression.aggregate.executor.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class LastNExecutor<TType> implements IAggregateExecutor<TType, List<TType>> {
	private LinkedList<TType> list;
	private Integer maxSize;
	
	public LastNExecutor(Integer maxSize) {
		this.maxSize = maxSize;
		this.list = new LinkedList<TType>();
	}

	@Override
	public void execute(TType input) throws Exception {
		list.add(input);
		while(list.size() > maxSize) {
			list.poll();
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
		this.list = (LinkedList<TType>)state;
	}

}
