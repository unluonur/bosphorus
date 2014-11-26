package org.bosphorus.expression.batch;

public class CountIntegerExecutor implements IBatchExecutor<Object, Integer> {
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

	@Override
	public Object getState() {
		return this.value;
	}

	@Override
	public void setState(Object state) {
		this.value = (Integer)state;
	}
}
