package org.bosphorus.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class SumBagInteger extends BaseAggregationBag<Integer, Integer> {
	private Integer sum;
	
	public SumBagInteger(IExpression<Integer> expression) {
		super(expression);
		sum = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Integer getValue() {
		return sum;
	}

}
