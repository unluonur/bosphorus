package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagDouble;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

public class AvgDouble<TInput> extends BaseExpressionAggregation<TInput, Double, Double> {

	public AvgDouble(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Double> newBag() {
		return new AvgBagDouble<TInput>(this.getExpression());
	}
	
}
