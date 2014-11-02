package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class AvgBagFloat<TInput> extends BaseAggregationBag<TInput, Float, Float> {
	private Float sum;
	private Integer count;

	public AvgBagFloat(IExpression<TInput, Float> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		this.sum += this.getExpression().execute(input);
		this.count++;
	}

	@Override
	public Float getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0F;
		count = 0;
	}

}
