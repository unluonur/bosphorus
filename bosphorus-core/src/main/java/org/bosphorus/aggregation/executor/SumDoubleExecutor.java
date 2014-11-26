package org.bosphorus.aggregation.executor;

public class SumDoubleExecutor implements IAggregationExecutor<Number, Double> {
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

}
