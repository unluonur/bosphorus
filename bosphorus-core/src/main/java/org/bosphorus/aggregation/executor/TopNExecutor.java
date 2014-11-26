package org.bosphorus.aggregation.executor;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class TopNExecutor<TType> implements IAggregationExecutor<TType, List<TType>> {
	private LinkedList<TType> list;
	private Integer maxSize;
	private Comparator<TType> comparator;
	
	public TopNExecutor(Integer maxSize, Comparator<TType> comparator) {
		this.maxSize = maxSize;
		this.comparator = comparator;
		this.list = new LinkedList<TType>();
	}

	// TODO : Binary search may be implemented
	@Override
	public void execute(TType input) throws Exception {
		if(list.size() < maxSize || comparator.compare(input, list.getLast()) < 0) {
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
		return list;
	}

	@Override
	public void reset() {
		list.clear();
	}

}
