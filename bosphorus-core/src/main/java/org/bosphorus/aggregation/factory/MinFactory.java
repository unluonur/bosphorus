package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.MinBag;
import org.bosphorus.expression.IExpression;

public class MinFactory<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregationFactory<TInput, TOutput, TOutput> {

	public MinFactory(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, TOutput> create() {
		return new MinBag<TInput, TOutput>(this.getExpression());
	}

}
