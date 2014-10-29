package org.bosphorus.query.aggregation.bag;

import org.bosphorus.core.ITuple;
import org.bosphorus.expression.IExpression;

public class CountBagInteger<TType> extends BaseAggregationBag<Integer, TType> {
	private Integer value;

	public CountBagInteger(IExpression<TType> expression) {
		super(expression);
		this.value = 0;
	}

	@Override
	public void execute(ITuple input) throws Exception {
		IExpression<TType> expr = this.getExpression();
		if(expr != null && expr.execute(input) != null) {
			value++;
		}
	}

	@Override
	public Integer getValue() {
		return value;
	}
}
