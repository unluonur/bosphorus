package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagLong;
import org.bosphorus.expression.IExpression;

public class SumLong extends BaseExpressionAggregation<Long, Long> {
	
	public SumLong(IExpression<Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long, Long> newBag() {
		return new SumBagLong();
	}

}
