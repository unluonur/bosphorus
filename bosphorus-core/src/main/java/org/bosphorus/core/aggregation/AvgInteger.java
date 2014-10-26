package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.AvgBagInteger;
import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.expression.IExpression;

public class AvgInteger<TInput> extends BaseExpressionAggregation<TInput, Integer, Integer> {

	public AvgInteger(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer, Integer> newBag() {
		return new AvgBagInteger();
	}

}
