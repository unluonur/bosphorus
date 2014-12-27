package org.bosphorus.expression.aggregate.factory.scalar;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.scalar.ListExpressionExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListExpressionFactory<TInput, TType, TOutput> implements IAggregateExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor<? super TInput, ? extends List<? extends TType>> expression;
	private IAggregateExecutorFactory<? super TType, ? extends TOutput> factory;
	
	public ListExpressionFactory(IScalarExecutor<? super TInput, ? extends List<? extends TType>> expression, 
			IAggregateExecutorFactory<? super TType, ? extends TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IAggregateExecutor<TInput, TOutput> create() {
		return new ListExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
