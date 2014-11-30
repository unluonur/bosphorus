package org.bosphorus.expression.aggregate.factory.scalar;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.executor.scalar.ExpressionExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ExpressionFactory<TInput, TType, TOutput> implements IAggregateExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor<TInput, ? extends TType> expression;
	private IAggregateExecutorFactory<TType, TOutput> factory;
	
	public ExpressionFactory(IScalarExecutor<TInput, ? extends TType> expression, IAggregateExecutorFactory<TType, TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IAggregateExecutor<TInput, TOutput> create() {
		return new ExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
