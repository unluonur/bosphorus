package org.bosphorus.stream.batch;

import java.util.List;

import org.bosphorus.expression.batch.IBatchExecutor;
import org.bosphorus.stream.pipe.IPipe;

public class BatchStream<TInput, TOutput> implements IPipe<TInput>, IReader<TOutput> {

	protected Object lockObject;
	private IBatchExecutor<TInput, ? extends TOutput> executor;
	
	public BatchStream(IBatchExecutor<TInput, ? extends TOutput> executor) {
		this.lockObject = new Object();
		this.executor = executor;
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
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
			executor.execute(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
		}
	}
	
}
