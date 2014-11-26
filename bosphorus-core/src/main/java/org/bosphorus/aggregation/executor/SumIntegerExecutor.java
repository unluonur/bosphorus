package org.bosphorus.aggregation.executor;

public class SumIntegerExecutor implements IAggregationExecutor<Number, Integer> {
	private Integer sum;
	
	public SumIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.intValue();
	}

	@Override
	public Integer getValue() {
		return sum;
	}

	@Override
	public void reset() {
		sum = 0;
	}

}
