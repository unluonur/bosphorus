package org.bosphorus.query.aggregation;

import org.bosphorus.expression.IExpression;
import org.bosphorus.query.aggregation.bag.IAggregationBag;
import org.bosphorus.query.aggregation.bag.SumBagDouble;

public class SumDouble extends BaseExpressionAggregation<Double, Double> {
	
	public SumDouble(IExpression<Double> expression) {
		super(expression);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IAggregationBag<Double> newBag() {
		return new SumBagDouble(this.getExpression());
	}

}
