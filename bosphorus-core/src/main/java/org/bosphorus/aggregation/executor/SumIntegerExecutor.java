package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class SumIntegerExecutor<TInput> implements IAggregationExecutor<TInput, Integer> {
	private IExpression<TInput, Integer> expression;
	private Integer sum;
	
	public SumIntegerExecutor(IExpression<TInput, Integer> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += expression.execute(input);
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

}
