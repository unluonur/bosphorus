package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.ExpressionExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class ExpressionFactory<TInput, TType, TOutput> implements IAggregationFactory<TInput, TOutput> {
	
	private IExpression<TInput, TType> expression;
	private IAggregationFactory<TType, TOutput> factory;
	
	public ExpressionFactory(IExpression<TInput, TType> expression, IAggregationFactory<TType, TOutput> factory) {
		this.expression = expression;
		this.factory = factory;
	}
	
	@Override
	public IAggregationExecutor<TInput, TOutput> create() {
		return new ExpressionExecutor<TInput, TType, TOutput>(expression, factory.create());
	}

}
