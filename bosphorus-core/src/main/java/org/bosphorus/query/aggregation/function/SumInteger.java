package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagInteger;

public class SumInteger<TInput> extends BaseExpressionAggregation<TInput, Integer, Integer> {
	
	public SumInteger(IExpression<TInput, Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Integer> newBag() {
		return new SumBagInteger<TInput>(this.getExpression());
	}

}
