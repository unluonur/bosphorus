package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class AvgLongExecutor<TInput> implements IAggregationExecutor<TInput, Long> {
	private IExpression<TInput, ? extends Number> expression;
	private Long sum;
	private Long count;

	public AvgLongExecutor(IExpression<TInput, ? extends Number> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.expression.execute(input).longValue();
		this.count++;
	}

	@Override
	public Long getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0L;
		count = 0L;
	}

}
