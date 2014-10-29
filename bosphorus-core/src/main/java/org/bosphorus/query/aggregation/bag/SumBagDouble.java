package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class SumBagDouble extends BaseAggregationBag<Double, Double> {
	private Double sum;
	
	public SumBagDouble(IExpression<Double> expression) {
		super(expression);
		sum = 0.0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Double getValue() {
		return sum;
	}

}
