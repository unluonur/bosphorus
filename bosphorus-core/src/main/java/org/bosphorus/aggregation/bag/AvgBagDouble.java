package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class AvgBagDouble<TInput> extends BaseAggregationBag<TInput, Double, Double> {
	private Double sum;
	private Integer count;
	
	public AvgBagDouble(IExpression<TInput, Double> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
		count++;
	}

	@Override
	public Double getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0;
		count = 0;
	}

}
