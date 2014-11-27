package org.bosphorus.expression.aggregate.executor.math;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class SumDoubleExecutor implements IAggregateExecutor<Number, Double> {
	private Double sum;
	
	public SumDoubleExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.doubleValue();
	}

	@Override
	public Double getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0;
	}

	@Override
	public Object getState() {
		return this.sum;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.sum = (Double)state;
	}

}
