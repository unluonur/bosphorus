package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.SumBagLong;
import org.bosphorus.core.expression.IExpression;

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
