package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagLong;

public class SumLong extends BaseExpressionAggregation<Long, Long> {
	
	public SumLong(IExpression<Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Long> newBag() {
		return new SumBagLong(this.getExpression());
	}

}
