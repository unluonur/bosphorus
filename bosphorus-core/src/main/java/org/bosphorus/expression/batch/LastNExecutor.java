package org.bosphorus.expression.batch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LastNExecutor<TType> implements IBatchExecutor<TType, List<TType>> {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Object state) {
		// TODO Auto-generated method stub
		
	}

}
