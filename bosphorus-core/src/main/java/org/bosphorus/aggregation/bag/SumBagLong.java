package org.bosphorus.aggregation.bag;

public class SumBagLong implements IAggregationBag<Long, Long> {
	private Long _value;

	@Override
	public void execute(Long value) {
		this._value += value;
	}

	@Override
	public Long value() {
		return this._value;
	}

}
