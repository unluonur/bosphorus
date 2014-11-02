package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class CountBagLong<TInput, TType> extends BaseAggregationBag<TInput, Long, TType> {
	private Long value;

	public CountBagLong(IExpression<TInput, TType> expression) {
		super(expression);
	}

	@Override
	public void execute(TInput input) throws Exception {
		IExpression<TInput, TType> expr = this.getExpression();
		if(expr != null && expr.execute(input) != null) {
			value++;
		}
	}

	@Override
	public Long getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0L;
	}
}
