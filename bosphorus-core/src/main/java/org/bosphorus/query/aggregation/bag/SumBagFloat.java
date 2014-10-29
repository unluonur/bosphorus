package org.bosphorus.query.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagFloat<TInput> extends BaseAggregationBag<TInput, Float, Float> {
	private Float sum;
	
	public SumBagFloat(IExpression<TInput, Float> expression) {
		super(expression);
		sum = 0.0F;
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Float getValue() {
		return sum;
	}

}
