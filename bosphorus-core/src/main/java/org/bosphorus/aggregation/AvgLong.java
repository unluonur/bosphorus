package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagLong;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgLong extends BaseExpressionAggregation<Long, Long> {

	public AvgLong(IExpression<Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long> newBag() {
		return new AvgBagLong(this.getExpression());
	}

}
