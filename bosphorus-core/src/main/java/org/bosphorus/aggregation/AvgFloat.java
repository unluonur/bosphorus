package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagFloat;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgFloat extends BaseExpressionAggregation<Float, Float> {

	public AvgFloat(IExpression<Float> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Float> newBag() {
		return new AvgBagFloat(this.getExpression());
	}

}
