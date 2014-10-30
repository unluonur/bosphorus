package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagLong;

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
