package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagFloat<TInput> extends BaseAggregationBag<TInput, Float, Float> {
	private Float sum;
	
	public SumBagFloat(IExpression<TInput, Float> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Float getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0F;
	}

}
