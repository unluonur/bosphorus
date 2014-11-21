package org.bosphorus.stream.pipe;

import java.util.List;

public class OneToMany<TType> implements IPipe<TType> {
	private List<IPipe<TType>> outputStreams;
	
	public OneToMany(List<IPipe<TType>> outputStreams) {
		this.outputStreams = outputStreams;
	}

	@Override
	public void writeOne(TType input) throws Exception {
		for(IPipe<TType> writer: outputStreams) {
			writer.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<TType> input) throws Exception {
		for(IPipe<TType> writer: outputStreams) {
			writer.writeMulti(input);
		}
	}

}
