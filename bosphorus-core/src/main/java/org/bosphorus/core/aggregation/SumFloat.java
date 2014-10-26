package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.SumBagFloat;
import org.bosphorus.core.expression.IExpression;

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
