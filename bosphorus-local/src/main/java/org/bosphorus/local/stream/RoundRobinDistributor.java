package org.bosphorus.local.stream;

import java.util.List;

import org.bosphorus.stream.IStreamWriter;

public class RoundRobinDistributor<TType> implements IStreamWriter<TType> {
	private Object lockObject;
	private List<IStreamWriter<TType>> outputStreams;
	private Integer currentIndex;
	
	public RoundRobinDistributor(List<IStreamWriter<TType>> outputStreams) {
		this.lockObject = new Object();
		this.outputStreams = outputStreams;
		this.currentIndex = 0;
	}

	@Override
	public void writeOne(TType input) throws Exception {
		synchronized (lockObject) {
			this.outputStreams.get(this.currentIndex++).writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<TType> input) throws Exception {
		synchronized (lockObject) {
			Integer blockSize = (input.size() + outputStreams.size() - 1) / outputStreams.size();
			Integer current = 0;
			// TODO
		}
		for(IStreamWriter<TType> writer: outputStreams) {
			writer.writeMulti(input);
		}
	}

}
