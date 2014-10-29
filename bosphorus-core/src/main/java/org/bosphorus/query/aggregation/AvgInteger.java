package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.AvgBagInteger;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

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
