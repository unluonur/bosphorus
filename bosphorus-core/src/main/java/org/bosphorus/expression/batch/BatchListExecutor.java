package org.bosphorus.expression.batch;

import java.util.ArrayList;
import java.util.List;

public class BatchListExecutor<TInput, TOutput> implements IBatchExecutor<TInput, List<TOutput>> {
	private List<IBatchExecutor<TInput, ? extends TOutput>> list;
	
	public BatchListExecutor(List<IBatchExecutor<TInput, ? extends TOutput>> list) {
		this.list = list;
	}
	
	@Override
	public void execute(TInput input) throws Exception {
		for(IBatchExecutor<TInput, ? extends TOutput> bag: list) {
			bag.execute(input);
		}
	}

	@Override
	public List<TOutput> getValue() {
		ArrayList<TOutput> result = new ArrayList<TOutput>();
		for(IBatchExecutor<TInput, ? extends TOutput> bag: list) {
			result.add(bag.getValue());
		}
		return result;
	}

	@Override
	public void reset() {
		for(IBatchExecutor<? extends TInput, ? extends TOutput> bag: list) {
			bag.reset();
		}
	}

	@Override
	public Object getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(Object state) {
		// TODO Auto-generated method stub
		
	}

}
