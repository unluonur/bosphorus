package org.bosphorus.stream.pipe;

import java.util.List;

public abstract class BaseSyncPipe<TInput> implements IPipe<TInput> {
	
	protected Object lockObject;
	
	public BaseSyncPipe() {
		this.lockObject = new Object();
	}

	protected abstract void process(TInput input) throws Exception;
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (this.lockObject) {
			this.process(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				this.process(item);
			}
		}
	}
}
