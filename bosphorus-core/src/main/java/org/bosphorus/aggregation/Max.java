package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.MaxBag;
import org.bosphorus.expression.IExpression;

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
