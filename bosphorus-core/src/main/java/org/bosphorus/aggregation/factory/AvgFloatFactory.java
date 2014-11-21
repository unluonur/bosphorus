package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.AvgBagFloat;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgFloatFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Float, Float> {

	public AvgFloatFactory(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Float> create() {
		return new AvgBagFloat<TInput>(this.getExpression());
	}

}
