package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagLong<TInput> extends BaseAggregationBag<TInput, Long, Long> {
	private Long sum;
	
	public SumBagLong(IExpression<TInput, Long> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Long getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0L;
	}

}
