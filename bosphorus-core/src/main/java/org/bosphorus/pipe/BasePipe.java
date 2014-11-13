package org.bosphorus.pipe;

import java.util.List;

public abstract class BasePipe<TInput> implements IPipe<TInput> {
	
	@Override
	public void write(List<TInput> input) throws Exception {
		for(TInput item: input) {
			this.write(item);
		}
	}
	
}
