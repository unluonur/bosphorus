package org.bosphorus.stream.batch.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.stream.IReader;

public class StreamJoin<TInput> implements IReader<List<List<TInput>>> {
	private IReader<List<TInput>> maimStream;

	@Override
	public List<List<TInput>> read() throws Exception {
		List<TInput> data = maimStream.read();
		ArrayList<List<TInput>> result = new ArrayList<List<TInput>>();
		for(TInput tuple: data) {
			ArrayList<TInput> aggregateTuple = new ArrayList<TInput>();
			aggregateTuple.add(tuple);
			result.add(aggregateTuple);
		}
		return result;
	}

}
