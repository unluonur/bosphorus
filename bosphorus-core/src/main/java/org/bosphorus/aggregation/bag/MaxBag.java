package org.bosphorus.aggregation.bag;

public class MaxBag<TOutput extends Comparable<TOutput>> implements IAggregationBag<TOutput, TOutput> {
	private TOutput _value;
	
	@Override
	public void execute(TOutput value) {
		if(this._value == null || this._value.compareTo(value) < 0) {
			this._value = value;
		}
	}

	@Override
	public TOutput value() {
		return this._value;
	}

}
