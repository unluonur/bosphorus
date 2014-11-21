package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.CountDistinctBag;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountDistinctFactory<TInput, TType extends Comparable<TType>> extends BaseExpressionAggregationFactory<TInput, Integer, TType> {

	public CountDistinctFactory(IExpression<TInput, TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<TInput, Integer> create() {
		return new CountDistinctBag<TInput, TType>(this.getExpression());
	}

}
