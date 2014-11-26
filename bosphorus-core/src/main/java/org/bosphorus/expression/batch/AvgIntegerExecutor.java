package org.bosphorus.expression.batch;

import java.io.Serializable;

public class AvgIntegerExecutor implements IBatchExecutor<Number, Integer> {
	private State state;

	public AvgIntegerExecutor() {
		this.state = new State();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		state.sum += input.longValue();
		state.count++;
	}

	@Override
	public Integer getValue() {
		if(state.count != 0) {
			Long l = state.sum / state.count;
			return l.intValue();	
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
	public void setState(Object state) {
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
