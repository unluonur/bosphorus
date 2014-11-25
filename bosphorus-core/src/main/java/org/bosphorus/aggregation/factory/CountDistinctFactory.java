package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.CountDistinctExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class CountDistinctFactory<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregationFactory<TInput, Integer, TType> {

	public CountDistinctFactory(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationExecutor<TInput, Integer> create() {
		return new CountDistinctExecutor<TInput, TType>(this.getExpression());
	}

}
