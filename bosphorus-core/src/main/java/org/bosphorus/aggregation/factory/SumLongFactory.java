package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.SumLongExecutor;
import org.bosphorus.expression.IExpression;

public class SumLongFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Long, Long> {
	
	public SumLongFactory(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, Long> create() {
		return new SumLongExecutor<TInput>(this.getExpression());
	}

}
