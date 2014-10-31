package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountDistinctBag;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountDistinct<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregation<TInput, Integer, TType> {

	public CountDistinct(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<TInput, Integer> newBag() {
		return new CountDistinctBag<TInput, TType>(this.getExpression());
	}

}
