package org.bosphorus.stream.batch;

import java.util.List;

import org.bosphorus.aggregation.executor.DistinctExecutor;
import org.bosphorus.expression.InputExpression;
import org.bosphorus.stream.pipe.BaseSyncPipe;

public class SelectDistinct<TInput> extends BaseSyncPipe<TInput> implements IReader<List<TInput>> {
	private DistinctExecutor<TInput, TInput> distinct;

	public SelectDistinct() {
		this.distinct = new DistinctExecutor<TInput, TInput>(new InputExpression<TInput>());
	}
	
	@Override
	protected void process(TInput input) throws Exception {
		this.distinct.execute(input);;
	}

	@Override
	public List<TInput> read() throws Exception {
		synchronized (lockObject) {
			List<TInput> result = distinct.getValue();
			distinct.reset();
			return result;
		}
	}
}
