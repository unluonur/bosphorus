package org.bosphorus.expression.aggregate.executor.list;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;

public class AggregationListExecutor<TInput, TOutput> implements IAggregateExecutor<TInput, List<TOutput>> {
	private List<IAggregateExecutor<TInput, ? extends TOutput>> list;
	
	public AggregationListExecutor(List<IAggregateExecutor<TInput, ? extends TOutput>> list) {
		this.list = list;
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IAggregateExecutor<TInput, ? extends TOutput> bag: list) {
			bag.execute(input);
		}
	}

	@Override
	public List<TOutput> getValue() {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IAggregateExecutor<TInput, ? extends TOutput> bag: list) {
			result.add(bag.getValue());
		}
		return result;
	}

	@Override
	public void reset() {
		for(IAggregateExecutor<? extends TInput, ? extends TOutput> bag: list) {
			bag.reset();
		}
	}

	@Override
	public Object getState() {
		ArrayList<Object> state = new ArrayList<Object>();
		for(IAggregateExecutor<TInput, ? extends TOutput> executor: this.list) {
			state.add(executor.getState());
		}
		return state;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setState(Object state) throws Exception {
		ArrayList<Object> stateList = (ArrayList<Object>)state;
		for(Integer i=0; i<this.list.size(); i++) {
			this.list.get(i).setState(stateList.get(i));
		}
	}

}
