package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.AvgFloatExecutor;
import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.expression.IExpression;

public class AvgFloatFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Float, Float> {

	public AvgFloatFactory(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Float> create() {
		return new AvgFloatExecutor<TInput>(this.getExpression());
	}

}
