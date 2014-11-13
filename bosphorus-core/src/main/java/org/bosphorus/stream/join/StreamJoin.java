package org.bosphorus.stream.join;

import java.util.ArrayList;
import java.util.List;

import org.bosphorus.pipe.IReader;

public class StreamJoin<TInput> implements IReader<List<TInput>> {
	private IReader<TInput> maimStream;

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
