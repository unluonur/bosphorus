package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountIntegerExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class CountIntegerFactory<TInput, TType> extends BaseExpressionAggregationFactory<TInput, Integer, TType> {

	public CountIntegerFactory(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Integer> create() {
		return new CountIntegerExecutor<TInput, TType>(this.getExpression());
	}
	
}
