package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.executor.MinExecutor;
import org.bosphorus.expression.IExpression;

public class MinFactory<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregationFactory<TInput, TOutput, TOutput> {

	public MinFactory(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationExecutor<TInput, TOutput> create() {
		return new MinExecutor<TInput, TOutput>(this.getExpression());
	}

}
