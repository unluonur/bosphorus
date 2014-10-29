package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class AvgBagLong extends BaseAggregationBag<Long, Long> {
	private Long sum;
	private Integer count;

	public AvgBagLong(IExpression<Long> expression) {
		super(expression);
		sum = 0L;
		count = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		this.sum += this.getExpression().execute(input);
		this.count++;
	}

	@Override
	public Long getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

}
