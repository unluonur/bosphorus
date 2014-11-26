package org.bosphorus.aggregation.executor;

public class AvgDoubleExecutor implements IAggregationExecutor<Number, Double> {
	private Double sum;
	private Long count;
	
	public AvgDoubleExecutor() {
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		sum += input.doubleValue();
		count++;
	}

	@Override
	public Double getValue() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		sum = 0.0;
		count = 0L;
	}

}
