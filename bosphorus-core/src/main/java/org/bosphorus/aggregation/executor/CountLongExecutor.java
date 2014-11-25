package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class CountLongExecutor<TInput, TType> implements IAggregationExecutor<TInput, Long> {
	private IExpression<TInput, TType> expression;
	private Long value;

	public CountLongExecutor(IExpression<TInput, TType> expression) {
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
	public Long getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0L;
	}
}
