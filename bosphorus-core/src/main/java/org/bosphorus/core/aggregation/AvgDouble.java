package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.AvgBagDouble;
import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.expression.IExpression;

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
