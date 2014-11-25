package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.MaxExecutor;
import org.bosphorus.expression.IExpression;

public class MaxFactory<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregationFactory<TInput, TOutput, TOutput> {

	public MaxFactory(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, TOutput> create() {
		return new MaxExecutor<TInput, TOutput>(this.getExpression());
	}

}
