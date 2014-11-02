package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

public class Buffer<TInput> implements IStreamReader<TInput>, IStreamWriter<TInput> {

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
