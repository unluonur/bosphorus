package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagInteger;

public class SumInteger extends BaseExpressionAggregation<Integer, Integer> {
	
	public SumInteger(IExpression<Integer> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Integer> newBag() {
		return new SumBagInteger(this.getExpression());
	}

}
