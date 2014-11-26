package org.bosphorus.aggregation.executor;

public class AvgIntegerExecutor implements IAggregationExecutor<Number, Integer> {
	private Long sum;
	private Integer count;

	public AvgIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.intValue();
		this.count++;
	}

	@Override
	public Integer getValue() {
		if(this.count != 0) {
			Long l = this.sum / this.count;
			return l.intValue();	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0L;
		count = 0;
	}

}
