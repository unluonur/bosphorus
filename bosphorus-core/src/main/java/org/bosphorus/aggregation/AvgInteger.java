package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgInteger extends BaseExpressionAggregation<Integer, Integer> {

	public AvgInteger(IExpression<Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer, Integer> newBag() {
		return new AvgBagInteger();
	}

}
