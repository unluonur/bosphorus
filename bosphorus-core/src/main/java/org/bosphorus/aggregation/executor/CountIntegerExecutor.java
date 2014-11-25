package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class CountIntegerExecutor<TInput, TType> implements IAggregationExecutor<TInput, Integer> {
	private IExpression<TInput, TType> expression;
	private Integer value;

	public CountIntegerExecutor(IExpression<TInput, TType> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		if(expression != null && expression.execute(input) != null) {
			value++;
		}
	}

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0;
	}
}
