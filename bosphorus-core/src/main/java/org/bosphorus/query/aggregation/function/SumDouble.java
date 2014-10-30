package org.bosphorus.query.aggregation.function;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagDouble;

public class SumDouble<TInput> extends BaseExpressionAggregation<TInput, Double, Double> {
	
	public SumDouble(IExpression<TInput, Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<TInput, Double> newBag() {
		return new SumBagDouble<TInput>(this.getExpression());
	}

}
