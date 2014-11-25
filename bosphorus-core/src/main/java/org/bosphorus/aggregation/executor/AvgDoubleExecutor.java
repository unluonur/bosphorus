package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class AvgDoubleExecutor<TInput> implements IAggregationExecutor<TInput, Double> {
	private IExpression<TInput, ? extends Number> expression;
	private Double sum;
	private Long count;
	
	public AvgDoubleExecutor(IExpression<TInput, ? extends Number> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.expression.execute(input).doubleValue();
		count++;
	}

	@Override
	public Double getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0;
		count = 0L;
	}

}
