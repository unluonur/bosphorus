package org.bosphorus.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDistributor<TType> implements IStreamWriter<TType> {
	private ArrayList<IStreamWriter<TType>> outputStreams;

	@Override
	public void writeSingle(TType input) throws Exception {
		for(IStreamWriter<TType> writer: outputStreams) {
			writer.writeSingle(input);
		}
	}

	@Override
	public void writeMulti(List<TType> input) throws Exception {
		for(IStreamWriter<TType> writer: outputStreams) {
			writer.writeMulti(input);
		}
	}

}
