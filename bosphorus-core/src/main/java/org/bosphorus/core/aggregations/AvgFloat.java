package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.AvgBagFloat;
import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.expressions.IExpression;

public class AvgFloat<TInput> extends BaseExpressionAggregation<TInput, Float, Float> {

	public AvgFloat(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Float, Float> newBag() {
		return new AvgBagFloat();
	}

}
