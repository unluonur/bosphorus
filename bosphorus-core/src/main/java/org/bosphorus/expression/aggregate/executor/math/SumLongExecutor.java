package org.bosphorus.expression.aggregate.executor.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class SumLongExecutor implements IAggregateExecutor<Number, Long> {
	private Long sum;
	
	public SumLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.longValue();
	}

	@Override
	public Long getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0L;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.sum = (Long)state;
	}

}
