package org.bosphorus.expression.batch;

public class SumDoubleExecutor implements IBatchExecutor<Number, Double> {
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
	public void setState(Object state) {
		this.sum = (Double)state;
	}

}
