package org.bosphorus.query.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class SumBagLong<TInput> extends BaseAggregationBag<TInput, Long, Long> {
	private Long sum;
	
	public SumBagLong(IExpression<TInput, Long> expression) {
		super(expression);
		sum = 0L;
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.getExpression().execute(input);
	}

	@Override
	public Long getValue() {
		return sum;
	}

}