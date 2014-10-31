package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class AvgBagLong<TInput> extends BaseAggregationBag<TInput, Long, Long> {
	private Long sum;
	private Integer count;

	public AvgBagLong(IExpression<TInput, Long> expression) {
		super(expression);
		sum = 0L;
		count = 0;
	}

	@Override
	public void execute(TInput input) throws Exception {
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
