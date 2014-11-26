package org.bosphorus.aggregation.executor;

public class SumFloatExecutor implements IAggregationExecutor<Number, Float> {
	private Float sum;
	
	public SumFloatExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.floatValue();
	}

	@Override
	public Float getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0.0F;
	}

}
