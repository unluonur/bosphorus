package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagFloat;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
