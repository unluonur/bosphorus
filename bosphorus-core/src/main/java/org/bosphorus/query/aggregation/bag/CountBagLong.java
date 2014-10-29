package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class CountBagLong<TType> extends BaseAggregationBag<Long, TType> {
	private Long value;

	public CountBagLong(IExpression<TType> expression) {
		super(expression);
		this.value = 0L;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		IExpression<TType> expr = this.getExpression();
		if(expr != null && expr.execute(input) != null) {
			value++;
		}
	}

	@Override
	public Long getValue() {
		return value;
	}
}
