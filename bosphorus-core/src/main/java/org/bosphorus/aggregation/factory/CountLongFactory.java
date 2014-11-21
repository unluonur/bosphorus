package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.CountBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountLongFactory<TInput, TType> extends BaseExpressionAggregationFactory<TInput, Long, TType> {

	public CountLongFactory(IExpression<TInput, TType> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> create() {
		return new CountBagLong<TInput, TType>(this.getExpression());
	}
	
}
