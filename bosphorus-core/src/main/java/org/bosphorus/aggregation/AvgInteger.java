package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.AvgBagInteger;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class AvgInteger<TInput> extends BaseExpressionAggregation<TInput, Integer, Integer> {

	public AvgInteger(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> newBag() {
		return new AvgBagInteger<TInput>(this.getExpression());
	}

}
