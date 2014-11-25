package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgLongExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class AvgLongFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Long, Long> {

	public AvgLongFactory(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Long> create() {
		return new AvgLongExecutor<TInput>(this.getExpression());
	}

}
