package org.bosphorus.expression.aggregate.executor.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class TopNExecutor<TType> implements IAggregateExecutor<TType, List<TType>> {
	private List<TType> list;
	private Integer maxSize;
	private Comparator<TType> comparator;
	
	public TopNExecutor(Integer maxSize, Comparator<TType> comparator) {
		this.maxSize = maxSize;
		this.comparator = comparator;
		this.list = new ArrayList<TType>();
	}

	// TODO : Binary search may be implemented
	@Override
	public void execute(TType input) throws Exception {
		if(list.size() < maxSize || comparator.compare(input, list.get(list.size() - 1)) < 0) {
			Integer index = 0;
			for(; index<list.size()-1; index++) {
				if(comparator.compare(input, list.get(index)) < 0) {
					break;
				}
			}
			list.add(index, input);
			while(list.size()>maxSize) {
				list.remove(list.size() - 1);
			}
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
