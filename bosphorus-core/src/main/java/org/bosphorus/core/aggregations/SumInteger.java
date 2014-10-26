package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.aggregations.bags.SumBagInteger;
import org.bosphorus.core.expressions.IExpression;

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
