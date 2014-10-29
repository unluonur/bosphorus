package org.bosphorus.aggregation;

import org.bosphorus.aggregation.bag.CountDistinctBag;
import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.expression.IExpression;

public class CountDistinct<TType extends Comparable<TType>> extends BaseExpressionAggregation<Integer, TType> {

	public CountDistinct(IExpression<TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<Integer> newBag() {
		return new CountDistinctBag<TType>(this.getExpression());
	}

}
