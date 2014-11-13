package org.bosphorus.pipe;

import java.util.List;

public abstract class BaseSyncPipe<TInput> implements IPipe<TInput> {
	
	protected Object lockObject;
	
	public BaseSyncPipe() {
		this.lockObject = new Object();
	}

	protected abstract void process(TInput input) throws Exception;
	
	@Override
	public void write(TInput input) throws Exception {
		synchronized (this.lockObject) {
			this.process(input);
		}
	}

	@Override
	public void write(List<TInput> input) throws Exception {
		synchronized (this.lockObject) {
			for(TInput item: input) {
				this.process(item);
			}
		}
	}
}
