package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountBagInteger;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
