package org.bosphorus.expression.aggregate.factory.list;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.list.LastNExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;

public class LastNFactory<TType> implements IAggregateExecutorFactory<TType, List<TType>> {
	private Integer maxSize;
	
	public LastNFactory(Integer maxSize) {
		this.maxSize = maxSize;
	}
	
	@Override
	public IAggregateExecutor<TType, List<TType>> create() {
		return new LastNExecutor<TType>(maxSize);
	}

}
