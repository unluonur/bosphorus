package org.bosphorus.stream.batch;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.stream.IWriter;

public class MaxSizeBatch<TInput, TOutput> implements IWriter<TInput> {

	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	private IWriter<? super TOutput> output;
	private Integer maxSize;
	private Integer count;
	
	public MaxSizeBatch(IAggregateExecutor<? super TInput, ? extends TOutput> executor,
			IWriter<? super TOutput> output,
			Integer maxSize) {
		this.lockObject = new Object();
		this.executor = executor;
		this.output = output;
		this.maxSize = maxSize;
		this.count = 0;
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
			executor.execute(input);
			count++;
			clear();
		}
	}

	@Override
	public void writeMulti(List<? extends TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				executor.execute(item);
			}
			count += input.size();
			clear();
		}
	}
	
	private void clear() throws Exception {
		if(count >= maxSize) {
			output.writeOne(executor.getValue());
			executor.reset();
			count = 0;
		}
	}
}
