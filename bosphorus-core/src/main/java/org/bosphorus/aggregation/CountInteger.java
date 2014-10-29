package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountInteger<TType> extends BaseExpressionAggregation<Integer, TType> {

	public CountInteger(IExpression<TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer> newBag() {
		return new CountBagInteger<TType>(this.getExpression());
	}
	
}
