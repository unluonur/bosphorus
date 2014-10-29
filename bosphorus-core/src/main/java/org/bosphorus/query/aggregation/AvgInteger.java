package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagInteger;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

public class AvgInteger extends BaseExpressionAggregation<Integer, Integer> {

	public AvgInteger(IExpression<Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer> newBag() {
		return new AvgBagInteger(this.getExpression());
	}

}
