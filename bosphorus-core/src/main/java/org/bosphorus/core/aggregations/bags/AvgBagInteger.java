package org.bosphorus.core.aggregations.bags;

public class AvgBagInteger implements IAggregationBag<Integer, Integer> {
	private Integer sum;
	private Integer count;

	@Override
	public void execute(Integer value) {
		this.sum += value;
		this.count++;
	}

	@Override
	public Integer value() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return 0;
	}

}
