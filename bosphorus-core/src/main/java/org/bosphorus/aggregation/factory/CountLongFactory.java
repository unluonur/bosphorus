package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountLongExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class CountLongFactory<TInput, TType> extends BaseExpressionAggregationFactory<TInput, Long, TType> {

	public CountLongFactory(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Long> create() {
		return new CountLongExecutor<TInput, TType>(this.getExpression());
	}
	
}
