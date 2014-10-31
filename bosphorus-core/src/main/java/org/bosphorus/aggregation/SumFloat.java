package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagFloat;
import org.bosphorus.expression.IExpression;

public class SumFloat<TInput> extends BaseExpressionAggregation<TInput, Float, Float> {
	
	public SumFloat(IExpression<TInput, Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Float> newBag() {
		return new SumBagFloat<TInput>(this.getExpression());
	}

}
