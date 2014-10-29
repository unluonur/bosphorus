package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountBagLong;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
