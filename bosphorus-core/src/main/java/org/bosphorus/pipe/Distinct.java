package org.bosphorus.pipe;

import java.util.ArrayList;
import java.util.List;

public class Distinct<TInput> extends BaseSyncPipe<TInput> implements IReader<TInput> {

	private ArrayList<TInput> data;

	public Distinct() {
		this.data = new ArrayList<TInput>();
	}
	
	@Override
	protected void process(TInput input) {
		for(TInput tuple: data) {
			if(data.equals(tuple)) {
				return;
			}
		}
		data.add(input);
	}

	@Override
	public List<TInput> read() throws Exception {
		synchronized (lockObject) {
			List<TInput> result = data;
			data = new ArrayList<TInput>();
			return result;
		}
	}
}
