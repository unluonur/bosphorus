package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.AvgBagDouble;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgDoubleFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Double, Double> {

	public AvgDoubleFactory(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Double> create() {
		return new AvgBagDouble<TInput>(this.getExpression());
	}
	
}
