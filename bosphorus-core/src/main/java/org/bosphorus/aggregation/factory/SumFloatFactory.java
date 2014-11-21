package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagFloat;
import org.bosphorus.expression.IExpression;

public class SumFloatFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Float, Float> {
	
	public SumFloatFactory(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Float> create() {
		return new SumBagFloat<TInput>(this.getExpression());
	}

}
