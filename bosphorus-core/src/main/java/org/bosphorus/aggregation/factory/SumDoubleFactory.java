package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumDoubleExecutor;
import org.bosphorus.expression.IExpression;

public class SumDoubleFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Double, Double> {
	
	public SumDoubleFactory(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Double> create() {
		return new SumDoubleExecutor<TInput>(this.getExpression());
	}

}
