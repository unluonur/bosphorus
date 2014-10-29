package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagDouble;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

public class AvgDouble extends BaseExpressionAggregation<Double, Double> {

	public AvgDouble(IExpression<Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Double> newBag() {
		return new AvgBagDouble(this.getExpression());
	}
	
}
