package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.MaxBag;
import org.bosphorus.expression.IExpression;

public class MaxFactory<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregationFactory<TInput, TOutput, TOutput> {

	public MaxFactory(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, TOutput> create() {
		return new MaxBag<TInput, TOutput>(this.getExpression());
	}

}
