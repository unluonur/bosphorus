package org.bosphorus.expression.batch;

import java.io.Serializable;

public class AvgFloatExecutor implements IBatchExecutor<Number, Float> {
	private State state;

	public AvgFloatExecutor() {
		this.state = new State();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		state.sum += input.doubleValue();
		state.count++;
	}

	@Override
	public Float getValue() {
		if(state.count != 0) {
			Double d = state.sum / state.count;
			return d.floatValue();
		}
		return null;
	}

	@Override
	public void reset() {
		state.sum = 0.0;
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
		
		public Double sum;
		public Long count;
	}

}
