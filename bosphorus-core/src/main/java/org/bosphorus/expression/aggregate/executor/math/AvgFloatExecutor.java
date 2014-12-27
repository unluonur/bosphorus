package org.bosphorus.expression.aggregate.executor.math;

import java.io.Serializable;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class AvgFloatExecutor implements IAggregateExecutor<Number, Float> {
	private State state;

	public AvgFloatExecutor() {
		this.state = new State();
		this.reset();
	}

	@Override
	public void execute(Number input) throws Exception {
		if(input != null) {
			state.sum += input.doubleValue();
			state.count++;
		}
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
	public void setState(Object state) throws Exception {
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
