package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumFloatExecutor;
import org.bosphorus.expression.IExpression;

public class SumFloatFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Float, Float> {
	
	public SumFloatFactory(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Float> create() {
		return new SumFloatExecutor<TInput>(this.getExpression());
	}

}
