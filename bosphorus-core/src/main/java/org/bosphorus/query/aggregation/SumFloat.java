package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagFloat;

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
