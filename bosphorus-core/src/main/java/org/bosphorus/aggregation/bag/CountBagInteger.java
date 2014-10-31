package org.bosphorus.aggregation.bag;

import org.bosphorus.expression.IExpression;

public class CountBagInteger<TInput, TType> extends BaseAggregationBag<TInput, Integer, TType> {
	private Integer value;

	public CountBagInteger(IExpression<TInput, TType> expression) {
		super(expression);
		this.value = 0;
	}

	@Override
	public void execute(TInput input) throws Exception {
		IExpression<TInput, TType> expr = this.getExpression();
		if(expr != null && expr.execute(input) != null) {
			value++;
		}
	}

	@Override
	public Integer getValue() {
		return value;
	}
}
