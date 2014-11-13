package org.bosphorus.pipe;

import java.util.List;

public class OneToMany<TType> implements IPipe<TType> {
	private List<IPipe<TType>> outputStreams;
	
	public OneToMany(List<IPipe<TType>> outputStreams) {
		this.outputStreams = outputStreams;
	}

	@Override
	public void write(TType input) throws Exception {
		for(IPipe<TType> writer: outputStreams) {
			writer.write(input);
		}
	}

	@Override
	public void write(List<TType> input) throws Exception {
		for(IPipe<TType> writer: outputStreams) {
			writer.write(input);
		}
	}

}
