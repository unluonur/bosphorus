package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagFloat;
import org.bosphorus.expression.IExpression;

public class SumFloat extends BaseExpressionAggregation<Float, Float> {
	
	public SumFloat(IExpression<Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Float> newBag() {
		return new SumBagFloat(this.getExpression());
	}

}
