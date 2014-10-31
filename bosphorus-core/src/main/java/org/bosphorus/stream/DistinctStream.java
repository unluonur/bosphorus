package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

public class DistinctStream<TInput> implements IStreamReader<TInput>, IStreamWriter<TInput> {

	private Object lockObject;
	private ArrayList<TInput> data;
	
	private void writeSingleData(TInput input) {
		for(TInput tuple: data) {
			if(data.equals(tuple)) {
				return;
			}
		}
		data.add(input);	
	}
	
	@Override
	public void writeSingle(TInput input) throws Exception {
		synchronized (lockObject) {
			writeSingleData(input);
		}
	}

	@Override
	public void writeMulti(List<TInput> input) throws Exception {
		synchronized (lockObject) {
			for(TInput tuple: input) {
				writeSingleData(tuple);
			}
		}
	}

	@Override
	public TInput read() throws Exception {
		synchronized (lockObject) {
			if(data.size()>0) {
				return data.remove(0);
			}
			return null;
		}
	}

	@Override
	public List<TInput> readAll() throws Exception {
		synchronized (lockObject) {
			List<TInput> result = data;
			data = new ArrayList<TInput>();
			return result;
		}
	}

}
