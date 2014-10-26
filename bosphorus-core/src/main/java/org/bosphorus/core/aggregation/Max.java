package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.MaxBag;
import org.bosphorus.core.expression.IExpression;

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
