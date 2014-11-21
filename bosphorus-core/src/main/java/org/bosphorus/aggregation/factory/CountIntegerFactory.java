package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.CountBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountIntegerFactory<TInput, TType> extends BaseExpressionAggregationFactory<TInput, Integer, TType> {

	public CountIntegerFactory(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> create() {
		return new CountBagInteger<TInput, TType>(this.getExpression());
	}
	
}
