package org.bosphorus.core.aggregation.bag;

public class SumBagInteger implements IAggregationBag<Integer, Integer> {
	private Integer _value;

	@Override
	public void execute(Integer value) {
		this._value += value;
	}

	@Override
	public Integer value() {
		return this._value;
	}

}
