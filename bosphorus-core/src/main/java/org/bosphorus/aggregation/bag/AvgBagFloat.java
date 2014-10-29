package org.bosphorus.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AvgBagFloat extends BaseAggregationBag<Float, Float> {
	private Float sum;
	private Integer count;

	public AvgBagFloat(IExpression<Float> expression) {
		super(expression);
		sum = 0.0F;
		count = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
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

}
