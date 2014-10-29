package org.bosphorus.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AvgBagInteger extends BaseAggregationBag<Integer, Integer> {
	private Integer sum;
	private Integer count;

	public AvgBagInteger(IExpression<Integer> expression) {
		super(expression);
		sum = 0;
		count = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		this.sum += this.getExpression().execute(input);
		this.count++;
	}

	@Override
	public Integer getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

}
