package org.bosphorus.expression.aggregate.executor.math;

import java.io.Serializable;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class AvgLongExecutor implements IAggregateExecutor<Number, Long> {

	private State state;
	
	public AvgLongExecutor() {
		this.state = new State();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			state.sum += input.longValue();
			state.count++;
		}
	}

	@Override
	public Long getValue() {
		if(state.count != 0) {
			return state.sum / state.count;	
		}
		return null;
	}

	@Override
	public void reset() {
		state.sum = 0L;
		state.count = 0L;
	}

	@Override
	public Object getState() {
		return state;
	}

	@Override
	public void setState(Object state) throws Exception {
		this.state = (State)state;
	}

	private static class State implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public Long sum;
		public Long count;
	}
	
}
