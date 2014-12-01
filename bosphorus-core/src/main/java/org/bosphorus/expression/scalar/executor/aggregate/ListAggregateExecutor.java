package org.bosphorus.expression.scalar.executor.aggregate;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.expression.aggregate.factory.IAggregateExecutorFactory;
import org.bosphorus.expression.scalar.executor.IScalarExecutor;

public class ListAggregateExecutor<TInput, TType, TOutput> implements IScalarExecutor<TInput, TOutput> {
	private IScalarExecutor<TInput, List<? extends TType>> listExpression;
	private IAggregateExecutorFactory<TType, ? extends TOutput> factory;
	
	public ListAggregateExecutor(IScalarExecutor<TInput, List<? extends TType>> listExpression, IAggregateExecutorFactory<TType, ? extends TOutput> factory) {
		this.listExpression = listExpression;
		this.factory = factory;
	}
	
	@Override
	public TOutput execute(TInput input) throws Exception {
		IAggregateExecutor<TType, ? extends TOutput> executor = factory.create();
		for(TType item: listExpression.execute(input)) {
			executor.execute(item);
		}
		return executor.getValue();
	}

}
