package org.bosphorus.expression.aggregate.executor.common;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class LastExecutor<TType> implements IAggregateExecutor<TType, TType> {
	private TType value;
	
	public LastExecutor() {
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(input != null) {
			value = input;
		}
	}

	@Override
	public TType getValue() {
		return value;
	}

	@Override
	public void reset() {
		value = null;
	}

	@Override
	public Object getState() {
		return value;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		value = (TType)state;
	}

}
