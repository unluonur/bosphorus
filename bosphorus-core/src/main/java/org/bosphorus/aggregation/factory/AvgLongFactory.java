package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.AvgBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgLongFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Long, Long> {

	public AvgLongFactory(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> create() {
		return new AvgBagLong<TInput>(this.getExpression());
	}

}
