package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class SumFloatExecutor<TInput> implements IAggregationExecutor<TInput, Float> {
	private IExpression<TInput, Float> expression;
	private Float sum;
	
	public SumFloatExecutor(IExpression<TInput, Float> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += expression.execute(input);
	}

	@Override
	public Float getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0F;
	}

}
