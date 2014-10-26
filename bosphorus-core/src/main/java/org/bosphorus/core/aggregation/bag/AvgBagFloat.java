package org.bosphorus.core.aggregation.bag;

public class AvgBagFloat implements IAggregationBag<Float, Float> {
	private Float sum;
	private Integer count;

	@Override
	public void execute(Float value) {
		this.sum += value;
		this.count++;
	}

	@Override
	public Float value() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return 0F;
	}

}
