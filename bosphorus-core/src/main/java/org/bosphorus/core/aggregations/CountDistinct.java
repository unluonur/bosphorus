package org.bosphorus.core.aggregations;

import org.bosphorus.core.aggregations.bags.CountDistinctBag;
import org.bosphorus.core.aggregations.bags.IAggregationBag;
import org.bosphorus.core.expressions.IExpression;

public class CountDistinct<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregation<TInput, Integer, TType> {

	public CountDistinct(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<Integer, TType> newBag() {
		return new CountDistinctBag<TType>();
	}

}
