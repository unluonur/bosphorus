package org.bosphorus.aggregation.executor;

public class MaxExecutor<TType extends Comparable<TType>> implements IAggregationExecutor<TType, TType> {
	private TType value;
	
	public MaxExecutor() {
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(this.value == null || this.value.compareTo(input) < 0) {
			this.value = input;
		}
	}

	@Override
	public TType getValue() {
		return this.value;
	}

	@Override
	public void reset() {
		value = null;
	}

}
