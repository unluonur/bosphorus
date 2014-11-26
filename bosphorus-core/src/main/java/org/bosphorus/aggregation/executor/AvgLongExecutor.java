package org.bosphorus.aggregation.executor;

public class AvgLongExecutor implements IAggregationExecutor<Number, Long> {
	private Long sum;
	private Long count;

	public AvgLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.longValue();
		this.count++;
	}

	@Override
	public Long getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0L;
		count = 0L;
	}

}
