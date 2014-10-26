package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.SumBagLong;
import org.bosphorus.core.expressions.IExpression;

public class SumLong<TInput> extends BaseExpressionAggregation<TInput, Long, Long> {
	
	public SumLong(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long, Long> newBag() {
		return new SumBagLong();
	}

}
