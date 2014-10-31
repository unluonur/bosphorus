package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagFloat;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgFloat<TInput> extends BaseExpressionAggregation<TInput, Float, Float> {

	public AvgFloat(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Float> newBag() {
		return new AvgBagFloat<TInput>(this.getExpression());
	}

}
