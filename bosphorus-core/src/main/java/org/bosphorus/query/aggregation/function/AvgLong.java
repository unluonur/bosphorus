package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagLong;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
