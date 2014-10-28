package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagDouble;
import org.bosphorus.expression.IExpression;

public class SumDouble extends BaseExpressionAggregation<Double, Double> {
	
	public SumDouble(IExpression<Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Double, Double> newBag() {
		return new SumBagDouble();
	}

}
