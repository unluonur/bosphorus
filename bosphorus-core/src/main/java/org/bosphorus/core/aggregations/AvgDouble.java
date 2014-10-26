package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.AvgBagDouble;
import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.expressions.IExpression;

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
