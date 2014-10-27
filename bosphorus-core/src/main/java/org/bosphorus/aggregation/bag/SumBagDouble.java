package org.bosphorus.aggregation.bag;

public class SumBagDouble implements IAggregationBag<Double, Double> {
	private Double _value;

	@Override
	public void execute(Double value) {
		this._value += value;
	}

	@Override
	public Double value() {
		return this._value;
	}

	
}
