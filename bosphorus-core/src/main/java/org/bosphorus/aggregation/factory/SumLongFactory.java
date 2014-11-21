package org.bosphorus.aggregation.factory;

import org.bosphorus.aggregation.bag.IAggregationBag;
import org.bosphorus.aggregation.bag.SumBagLong;
import org.bosphorus.expression.IExpression;

public class SumLongFactory<TInput> extends BaseExpressionAggregationFactory<TInput, Long, Long> {
	
	public SumLongFactory(IExpression<TInput, Long> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Long> create() {
		return new SumBagLong<TInput>(this.getExpression());
	}

}
