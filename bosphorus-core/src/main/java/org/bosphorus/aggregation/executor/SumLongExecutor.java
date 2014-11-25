package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class SumLongExecutor<TInput> implements IAggregationExecutor<TInput, Long> {
	private IExpression<TInput, Long> expression;
	private Long sum;
	
	public SumLongExecutor(IExpression<TInput, Long> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += expression.execute(input);
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
