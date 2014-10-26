package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.SumBagDouble;
import org.bosphorus.core.expression.IExpression;

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
