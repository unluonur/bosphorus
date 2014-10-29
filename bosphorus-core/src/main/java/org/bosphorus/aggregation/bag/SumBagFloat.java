package org.bosphorus.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class SumBagFloat extends BaseAggregationBag<Float, Float> {
	private Float sum;
	
	public SumBagFloat(IExpression<Float> expression) {
		super(expression);
		sum = 0.0F;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Float getValue() {
		return sum;
	}

}
