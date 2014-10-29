package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.MinBag;

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
