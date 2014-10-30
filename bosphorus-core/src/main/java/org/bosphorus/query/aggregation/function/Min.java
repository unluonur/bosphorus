package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.MinBag;

public class Min<TInput, TOutput extends Comparable<TOutput>> extends BaseExpressionAggregation<TInput, TOutput, TOutput> {

	public Min(IExpression<TInput, TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, TOutput> newBag() {
		return new MinBag<TInput, TOutput>(this.getExpression());
	}

}
