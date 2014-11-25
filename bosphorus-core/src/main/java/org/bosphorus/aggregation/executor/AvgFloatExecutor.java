package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class AvgFloatExecutor<TInput> implements IAggregationExecutor<TInput, Float> {
	private IExpression<TInput, ? extends Number> expression;
	private Double sum;
	private Long count;

	public AvgFloatExecutor(IExpression<TInput, ? extends Number> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.expression.execute(input).doubleValue();
		this.count++;
	}

	@Override
	public Float getValue() {
		if(this.count != 0) {
			Double d = this.sum / this.count;
			return d.floatValue();
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0;
		count = 0L;
	}

}
