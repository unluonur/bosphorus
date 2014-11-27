package org.bosphorus.expression.aggregate.factory.scalar;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.scalar.ListExpressionExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListExpressionFactory<TInput, TType, TOutput> implements IAggregateExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor<TInput, List<TType>> expression;
	private IAggregateExecutorFactory<TType, TOutput> factory;
	
	public ListExpressionFactory(IScalarExecutor<TInput, List<TType>> expression, IAggregateExecutorFactory<TType, TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IAggregateExecutor<TInput, TOutput> create() {
		return new ListExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
