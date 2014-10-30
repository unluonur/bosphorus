package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountDistinctBag;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

public class CountDistinct<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregation<TInput, Integer, TType> {

	public CountDistinct(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<TInput, Integer> newBag() {
		return new CountDistinctBag<TInput, TType>(this.getExpression());
	}

}
