package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagDouble;
import org.bosphorus.expression.IExpression;

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
