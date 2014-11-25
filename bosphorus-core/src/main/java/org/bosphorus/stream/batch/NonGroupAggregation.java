package org.bosphorus.stream.batch;

import org.bosphorus.aggregation.executor.IAggregationExecutor;
import org.bosphorus.aggregation.factory.IAggregationFactory;
import org.bosphorus.stream.pipe.BaseSyncPipe;

public class NonGroupAggregation<TInput, TOutput> extends BaseSyncPipe<TInput> implements IReader<TOutput> {
	
	private IAggregationExecutor<TInput, ? extends TOutput> executor;
	
	public NonGroupAggregation(IAggregationFactory<TInput, ? extends TOutput> expression) {
		executor = expression.create();
	}

	@Override
	public TOutput read() throws Exception {
		synchronized (lockObject) {
			TOutput result = executor.getValue();
			executor.reset();
			return result;
		}
	}
	
	@Override
	protected void process(TInput input) throws Exception {
		executor.execute(input);
	}
}
