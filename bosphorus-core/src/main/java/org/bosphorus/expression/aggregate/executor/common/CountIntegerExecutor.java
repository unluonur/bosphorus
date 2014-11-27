package org.bosphorus.expression.aggregate.executor.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;


public class CountIntegerExecutor implements IAggregateExecutor<Object, Integer> {
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
	public void setState(Object state) throws Exception {
		this.value = (Integer)state;
	}
}
