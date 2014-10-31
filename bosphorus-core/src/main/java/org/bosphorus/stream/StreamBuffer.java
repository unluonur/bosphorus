package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuffer<TInput> implements IStreamReader<TInput>, IStreamWriter<TInput> {

	private Object lockObject;
	private ArrayList<TInput> buffer;
	
	public StreamBuffer() {
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
	public List<TInput> readAll() throws Exception {
		synchronized (lockObject) {
			List<TInput> result = buffer;
			buffer = new ArrayList<TInput>();
			return result;
		}
	}

}
