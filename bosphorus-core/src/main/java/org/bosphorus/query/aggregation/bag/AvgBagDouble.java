package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AvgBagDouble extends BaseAggregationBag<Double, Double> {
	private Double sum;
	private Integer count;
	
	public AvgBagDouble(IExpression<Double> expression) {
		super(expression);
		sum = 0.0;
		count = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
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

}
