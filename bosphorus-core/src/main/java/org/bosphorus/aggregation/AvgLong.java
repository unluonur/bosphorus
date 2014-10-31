package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgLong<TInput> extends BaseExpressionAggregation<TInput, Long, Long> {

	public AvgLong(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> newBag() {
		return new AvgBagLong<TInput>(this.getExpression());
	}

}
