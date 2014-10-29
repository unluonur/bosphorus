package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagLong;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
