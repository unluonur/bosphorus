package org.bosphorus.core.aggregation;

import org.bosphorus.core.aggregation.bag.CountDistinctBag;
import org.bosphorus.core.aggregation.bag.IAggregationBag;
import org.bosphorus.core.expression.IExpression;

public class CountDistinct<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregation<TInput, Integer, TType> {

	public CountDistinct(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<Integer, TType> newBag() {
		return new CountDistinctBag<TType>();
	}

}
