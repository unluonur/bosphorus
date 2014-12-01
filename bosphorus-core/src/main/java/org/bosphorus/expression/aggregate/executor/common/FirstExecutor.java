package org.bosphorus.expression.aggregate.executor.common;

import java.io.Serializable;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class FirstExecutor<TType> implements IAggregateExecutor<TType, TType> {
	private State<TType> state;
	
	public FirstExecutor() {
		this.state = new State<TType>();
		this.reset();
	}

	@Override
	public void execute(TType input) throws Exception {
		if(!state.hasValue) {
			state.value = input;
			state.hasValue = true;
		}
	}

	@Override
	public TType getValue() {
		return state.value;
	}

	@Override
	public void reset() {
		state.hasValue = false;
		state.value = null;
	}

	@Override
	public Object getState() {
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		this.state = (State<TType>)state;
	}
	
	private static class State<TType> implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private Boolean hasValue;
		private TType value;
	}

}
