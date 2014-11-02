package org.bosphorus.stream;

import java.util.List;

public class AllDistributor<TType> implements IStreamWriter<TType> {
	private List<IStreamWriter<TType>> outputStreams;
	
	public AllDistributor(List<IStreamWriter<TType>> outputStreams) {
		this.outputStreams = outputStreams;
	}

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
