package org.bosphorus.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class SumBagLong extends BaseAggregationBag<Long, Long> {
	private Long sum;
	
	public SumBagLong(IExpression<Long> expression) {
		super(expression);
		sum = 0L;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Long getValue() {
		return sum;
	}

}
