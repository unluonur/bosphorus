package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.MinBag;
import org.bosphorus.expression.IExpression;

public class Min<TOutput extends Comparable<TOutput>> extends BaseExpressionAggregation<TOutput, TOutput> {

	public Min(IExpression<TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TOutput> newBag() {
		return new MinBag<TOutput>(this.getExpression());
	}

}
