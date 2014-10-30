package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagFloat;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
