package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.CountDistinctBag;
import org.bosphorus.query.aggregation.bag.IAggregationBag;

public class CountDistinct<TType extends Comparable<TType>> extends BaseExpressionAggregation<Integer, TType> {

	public CountDistinct(IExpression<TType> expression) {
		super(expression);		
	}

	@Override
	public IAggregationBag<Integer> newBag() {
		return new CountDistinctBag<TType>(this.getExpression());
	}

}
