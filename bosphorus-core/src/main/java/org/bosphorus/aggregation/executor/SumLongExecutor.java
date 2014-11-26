package org.bosphorus.aggregation.executor;

public class SumLongExecutor implements IAggregationExecutor<Number, Long> {
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

}
