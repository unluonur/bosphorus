package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.AvgBagLong;
import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.expressions.IExpression;

public class AvgLong<TInput> extends BaseExpressionAggregation<TInput, Long, Long> {

	public AvgLong(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long, Long> newBag() {
		return new AvgBagLong();
	}

}
