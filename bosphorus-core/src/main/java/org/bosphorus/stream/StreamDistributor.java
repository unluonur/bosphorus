package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDistributor<TType> implements IStreamWriter<TType> {
	private ArrayList<IStreamWriter<TType>> outputStreams;

	@Override
	public void writeOne(TType input) throws Exception {
		for(IStreamWriter<TType> writer: outputStreams) {
			writer.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<TType> input) throws Exception {
		for(IStreamWriter<TType> writer: outputStreams) {
			writer.writeMulti(input);
		}
	}

}
