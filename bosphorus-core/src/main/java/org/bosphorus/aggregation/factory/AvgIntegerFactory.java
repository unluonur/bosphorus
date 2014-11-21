package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.AvgBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgIntegerFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Integer, Integer> {

	public AvgIntegerFactory(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> create() {
		return new AvgBagInteger<TInput>(this.getExpression());
	}

}
