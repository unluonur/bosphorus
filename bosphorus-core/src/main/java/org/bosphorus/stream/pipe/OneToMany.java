package org.bosphorus.stream.pipe;

import java.util.List;

import org.bosphorus.stream.IWriter;

public class OneToMany<TType> implements IWriter<TType> {
	private List<? extends IWriter<? super TType>> outputStreams;
	
	public OneToMany(List<? extends IWriter<? super TType>> outputStreams) {
		this.outputStreams = outputStreams;
	}

	@Override
	public void writeOne(TType input) throws Exception {
		for(IWriter<? super TType> writer: outputStreams) {
			writer.writeOne(input);
		}
	}

	@Override
	public void writeMulti(List<? extends TType> input) throws Exception {
		for(IWriter<? super TType> writer: outputStreams) {
			writer.writeMulti(input);
		}
	}

}
