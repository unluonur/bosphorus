package org.bosphorus.stream.batch;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.bosphorus.expression.aggregate.executor.IAggregateExecutor;
import org.bosphorus.stream.IWriter;

public class TimeIntervalBatch<TInput, TOutput> implements IWriter<TInput> {

	protected Object lockObject;
	private IAggregateExecutor<? super TInput, ? extends TOutput> executor;
	private Timer timer;

	public TimeIntervalBatch(final IAggregateExecutor<? super TInput, ? extends TOutput> executor,
			final IWriter<? super TOutput> output,
			Integer interval) {
		this.lockObject = new Object();
		this.executor = executor;
		
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				try {
					synchronized (lockObject) {
						output.writeOne(executor.getValue());
						executor.reset();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, interval);
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
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

}
