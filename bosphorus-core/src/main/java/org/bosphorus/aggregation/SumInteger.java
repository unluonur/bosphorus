package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagInteger;
import org.bosphorus.expression.IExpression;

public class SumInteger<TInput> extends BaseExpressionAggregation<TInput, Integer, Integer> {
	
	public SumInteger(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer, Integer> newBag() {
		return new SumBagInteger();
	}

}
