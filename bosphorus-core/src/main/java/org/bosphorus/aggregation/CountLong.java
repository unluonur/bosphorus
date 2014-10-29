package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountLong<TType> extends BaseExpressionAggregation<Long, TType> {

	public CountLong(IExpression<TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long> newBag() {
		return new CountBagLong<TType>(this.getExpression());
	}
	
}
