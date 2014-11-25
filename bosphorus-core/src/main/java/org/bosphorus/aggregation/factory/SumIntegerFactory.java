package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumIntegerExecutor;
import org.bosphorus.expression.IExpression;

public class SumIntegerFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Integer, Integer> {
	
	public SumIntegerFactory(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Integer> create() {
		return new SumIntegerExecutor<TInput>(this.getExpression());
	}

}
