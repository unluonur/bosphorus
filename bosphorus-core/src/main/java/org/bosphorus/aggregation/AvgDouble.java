package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagDouble;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgDouble<TInput> extends BaseExpressionAggregation<TInput, Double, Double> {

	public AvgDouble(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Double, Double> newBag() {
		return new AvgBagDouble();
	}

}
