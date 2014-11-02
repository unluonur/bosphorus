package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagDouble<TInput> extends BaseAggregationBag<TInput, Double, Double> {
	private Double sum;
	
	public SumBagDouble(IExpression<TInput, Double> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Double getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0;
	}

}
