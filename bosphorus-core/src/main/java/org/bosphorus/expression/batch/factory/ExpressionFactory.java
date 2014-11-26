package org.bosphorus.expression.batch.factory;

import org.bosphorus.expression.batch.ExpressionExecutor;
import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;

public class ExpressionFactory<TInput, TType, TOutput> implements IBatchExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor<TInput, TType> expression;
	private IBatchExecutorFactory<TType, TOutput> factory;
	
	public ExpressionFactory(IScalarExecutor<TInput, TType> expression, IBatchExecutorFactory<TType, TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IBatchExecutor<TInput, TOutput> create() {
		return new ExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
