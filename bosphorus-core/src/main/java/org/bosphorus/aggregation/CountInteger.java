package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountInteger<TInput, TType> extends BaseExpressionAggregation<TInput, Integer, TType> {

	public CountInteger(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> newBag() {
		return new CountBagInteger<TInput, TType>(this.getExpression());
	}
	
}
