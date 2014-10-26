package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.SumBagFloat;
import org.bosphorus.core.expressions.IExpression;

public class SumFloat<TInput> extends BaseExpressionAggregation<TInput, Float, Float> {
	
	public SumFloat(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Float, Float> newBag() {
		return new SumBagFloat();
	}

}
