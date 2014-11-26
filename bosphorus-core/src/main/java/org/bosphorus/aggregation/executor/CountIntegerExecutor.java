package org.bosphorus.aggregation.executor;

public class CountIntegerExecutor implements IAggregationExecutor<Object, Integer> {
	private Integer value;

	public CountIntegerExecutor() {
		this.reset();
	}

	@Override
	public void execute(Object input) throws Exception {
		if(input != null) {
			value++;
		}
	}

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0;
	}
}
