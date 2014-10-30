package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountBagLong;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
