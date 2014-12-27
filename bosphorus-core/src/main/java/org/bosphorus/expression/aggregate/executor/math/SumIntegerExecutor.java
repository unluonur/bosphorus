package org.bosphorus.expression.aggregate.executor.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class SumIntegerExecutor implements IAggregateExecutor<Number, Integer> {
	private Integer sum;
	
	public SumIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			sum += input.intValue();
		}
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.sum = (Integer)state;
	}

}
