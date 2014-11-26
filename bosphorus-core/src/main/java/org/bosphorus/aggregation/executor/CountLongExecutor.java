package org.bosphorus.aggregation.executor;

public class CountLongExecutor implements IAggregationExecutor<Object, Long> {
	private Long value;

	public CountLongExecutor() {
		this.reset();
	}

	@Override
	public void execute(Object input) throws Exception {
		if(input != null) {
			value++;
		}
	}

	@Override
	public Long getValue() {
		return value;
	}

	@Override
	public void reset() {
		this.value = 0L;
	}
}
