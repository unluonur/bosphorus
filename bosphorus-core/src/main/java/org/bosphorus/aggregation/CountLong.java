package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountLong<TInput, TType> extends BaseExpressionAggregation<TInput, Long, TType> {

	public CountLong(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> newBag() {
		return new CountBagLong<TInput, TType>(this.getExpression());
	}
	
}
