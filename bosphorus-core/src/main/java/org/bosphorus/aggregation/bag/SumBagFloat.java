package org.bosphorus.aggregation.bag;

public class SumBagFloat implements IAggregationBag<Float, Float> {
	private Float _value;

	@Override
	public void execute(Float value) {
		this._value += value;
	}

	@Override
	public Float value() {
		return this._value;
	}

	
}
