package org.bosphorus.core.aggregations.bags;

public class AvgBagLong implements IAggregationBag<Long, Long> {
	private Long sum;
	private Integer count;

	@Override
	public void execute(Long value) {
		this.sum += value;
		this.count++;
	}

	@Override
	public Long value() {
		if(this.count != 0) {
			return this.sum / this.count;	
		}
		return 0L;
	}

}
