package org.bosphorus.aggregation.executor;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.bosphorus.expression.IExpression;

public class TopNExecutor<TInput, TType> implements IAggregationExecutor<TInput, List<TType>> {
	private IExpression<TInput, TType> expression;
	private LinkedList<TType> list;
	private Integer maxSize;
	private Comparator<TType> comparator;
	
	public TopNExecutor(IExpression<TInput, TType> expression, Integer maxSize, Comparator<TType> comparator) {
		this.expression = expression;
		this.maxSize = maxSize;
		this.comparator = comparator;
		this.list = new LinkedList<TType>();
	}

	// TODO : Binary search may be implemented
	@Override
	public void execute(TInput input) throws Exception {
		TType value = expression.execute(input);
		if(list.size() < maxSize || comparator.compare(value, list.getLast()) < 0) {
			Integer index = 0;
			for(; index<list.size()-1; index++) {
				if(comparator.compare(value, list.get(index)) < 0) {
					break;
				}
			}
			list.add(index, value);
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
