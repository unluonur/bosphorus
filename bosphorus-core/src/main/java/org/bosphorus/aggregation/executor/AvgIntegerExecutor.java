package org.bosphorus.aggregation.executor;

import org.bosphorus.expression.IExpression;

public class AvgIntegerExecutor<TInput> implements IAggregationExecutor<TInput, Integer> {
	private IExpression<TInput, ? extends Number> expression;
	private Long sum;
	private Integer count;

	public AvgIntegerExecutor(IExpression<TInput, ? extends Number> expression) {
		this.expression = expression;
		this.reset();
	}

	@Override
	public void execute(TInput input) throws Exception {
		sum += this.expression.execute(input).intValue();
		this.count++;
	}

	@Override
	public Integer getValue() {
		if(this.count != 0) {
			Long l = this.sum / this.count;
			return l.intValue();	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0L;
		count = 0;
	}

}
