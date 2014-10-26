package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.MaxBag;
import org.bosphorus.core.expressions.IExpression;

public class Max<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregation<TInput, TOutput, TOutput> {

	public Max(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TOutput, TOutput> newBag() {
		return new MaxBag<TOutput>();
	}

}
