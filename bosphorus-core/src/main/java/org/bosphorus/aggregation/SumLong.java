package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagLong;
import org.bosphorus.expression.IExpression;

public class SumLong<TInput> extends BaseExpressionAggregation<TInput, Long, Long> {
	
	public SumLong(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> newBag() {
		return new SumBagLong<TInput>(this.getExpression());
	}

}
