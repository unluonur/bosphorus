package org.bosphorus.stream.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.stream.IStreamReader;

public class JoinStarter<TInput> implements IStreamReader<List<TInput>> {
	private IStreamReader<TInput> firstStream;

	@Override
	public List<TInput> read() throws Exception {
		throw new java.lang.UnsupportedOperationException();
	}

	@Override
	public List<List<TInput>> readAll() throws Exception {
		List<TInput> data = firstStream.readAll();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(TInput tuple: data) {
			ArrayList<TInput> aggregateTuple = new ArrayList<TInput>();
			aggregateTuple.add(tuple);
			result.add(aggregateTuple);
		}
		return result;
	}


}
