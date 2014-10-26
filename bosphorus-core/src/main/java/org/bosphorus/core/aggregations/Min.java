package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.MinBag;
import org.bosphorus.core.expressions.IExpression;

public class Min<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregation<TInput, TOutput, TOutput> {

	public Min(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TOutput, TOutput> newBag() {
		return new MinBag<TOutput>();
	}

}
