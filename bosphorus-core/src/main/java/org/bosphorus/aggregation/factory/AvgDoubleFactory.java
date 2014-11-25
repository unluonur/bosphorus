package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgDoubleExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class AvgDoubleFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Double, Double> {

	public AvgDoubleFactory(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Double> create() {
		return new AvgDoubleExecutor<TInput>(this.getExpression());
	}
	
}
