package org.bosphorus.expression.aggregate.factory.list;

import java.util.Comparator;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.list.TopNExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class TopNFactory<TType> implements IAggregateExecutorFactory<TType, List<TType>> {
	private Integer maxSize;
	private Comparator<TType> comparator;
	
	public TopNFactory(Integer maxSize, Comparator<TType> comparator) {
		this.maxSize = maxSize;
		this.comparator = comparator;
	}
	
	@Override
	public IAggregateExecutor<TType, List<TType>> create() {
		return new TopNExecutor<TType>(maxSize, comparator);
	}

}
