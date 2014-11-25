package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class SumDoubleExecutor<TInput> implements IAggregationExecutor<TInput, Double> {
	private IExpression<TInput, Double> expression;
	private Double sum;
	
	public SumDoubleExecutor(IExpression<TInput, Double> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += expression.execute(input);
	}

	@Override
	public Double getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0;
	}

}
