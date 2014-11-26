package org.bosphorus.expression.batch.factory;

import java.util.List;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.expression.batch.ListExpressionExecutor;
import org.bosphorus.expression.scalar.IScalarExecutor;

public class ListExpressionFactory<TInput, TType, TOutput> implements IBatchExecutorFactory<TInput, TOutput> {
	
	private IScalarExecutor<TInput, List<TType>> expression;
	private IBatchExecutorFactory<TType, TOutput> factory;
	
	public ListExpressionFactory(IScalarExecutor<TInput, List<TType>> expression, IBatchExecutorFactory<TType, TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IBatchExecutor<TInput, TOutput> create() {
		return new ListExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
