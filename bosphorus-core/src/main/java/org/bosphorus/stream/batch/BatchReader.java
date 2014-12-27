package org.bosphorus.stream.batch;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.stream.IReader;
import org.bosphorus.stream.IWriter;

public class BatchReader<TInput, TOutput> implements IWriter<TInput>, IReader<TOutput> {
	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	
	public BatchReader(IAggregateExecutor<? super TInput, ? extends TOutput> executor) {
		this.lockObject = new Object();
		this.executor = executor;
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (lockObject) {
			executor.execute(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
		}
	}

	@Override
	public TOutput read() throws Exception {
		synchronized (lockObject) {
			TOutput result = executor.getValue();
			// TODO : state will be saved
			//Object state = executor.getState();
			executor.reset();
			return result;
		}
	}

}
