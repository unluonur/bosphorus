package org.bosphorus.stream.batch;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public class Buffer<TInput> implements IPipe<TInput>, IReader<TInput> {

	private Object lockObject;
	private ArrayList<TInput> buffer;
	
	public Buffer() {
		lockObject = new Object();
		buffer = new ArrayList<TInput>();
	}
	
	@Override
	public void writeOne(TInput input) throws Exception {
		synchronized (lockObject) {
			buffer.add(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		synchronized (lockObject) {
			buffer.addAll(input);
		}
	}

	@Override
	public List<TInput> read() throws Exception {
		synchronized (lockObject) {
			List<TInput> result = buffer;
			buffer = new ArrayList<TInput>();
			return result;
		}
	}
}
