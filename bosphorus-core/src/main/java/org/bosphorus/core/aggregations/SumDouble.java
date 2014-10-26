package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.SumBagDouble;
import org.bosphorus.core.expressions.IExpression;

public class SumDouble<TInput> extends BaseExpressionAggregation<TInput, Double, Double> {
	
	public SumDouble(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Double, Double> newBag() {
		return new SumBagDouble();
	}

}
