package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountBagInteger;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
