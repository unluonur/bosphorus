package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagFloat;

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
