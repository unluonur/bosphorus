package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagInteger;
import org.bosphorus.expression.IExpression;

public class SumIntegerFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Integer, Integer> {
	
	public SumIntegerFactory(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> create() {
		return new SumBagInteger<TInput>(this.getExpression());
	}

}
