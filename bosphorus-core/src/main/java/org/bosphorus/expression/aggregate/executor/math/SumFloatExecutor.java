package org.bosphorus.expression.aggregate.executor.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class SumFloatExecutor implements IAggregateExecutor<Number, Float> {
	private Float sum;
	
	public SumFloatExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			sum += input.floatValue();
		}
	}

	@Override
	public Float getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0F;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.sum = (Float)state;
	}

}
