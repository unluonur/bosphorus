package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.MaxBag;

public class Max<TOutput extends Comparable<TOutput>> extends BaseExpressionAggregation<TOutput, TOutput> {

	public Max(IExpression<TOutput> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TOutput> newBag() {
		return new MaxBag<TOutput>(this.getExpression());
	}

}
