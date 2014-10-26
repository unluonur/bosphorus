package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.aggregation.bag.SumBagInteger;
import org.bosphorus.core.expression.IExpression;

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
