package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagDouble;
import org.bosphorus.expression.IExpression;

public class SumDoubleFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Double, Double> {
	
	public SumDoubleFactory(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Double> create() {
		return new SumBagDouble<TInput>(this.getExpression());
	}

}
