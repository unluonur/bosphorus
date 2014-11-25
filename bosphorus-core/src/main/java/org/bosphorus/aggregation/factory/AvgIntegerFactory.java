package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgIntegerExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class AvgIntegerFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Integer, Integer> {

	public AvgIntegerFactory(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Integer> create() {
		return new AvgIntegerExecutor<TInput>(this.getExpression());
	}

}
