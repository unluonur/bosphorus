package org.bosphorus.builder.stream;

import org.bosphorus.stream.Distinct;
import org.bosphorus.stream.IStreamWriter;

public class DistinctBuilder<TInput> implements IStreamBuilder<TInput, TInput> {
	private IConnector<TInput> connector;

	@Override
	public IStreamWriter<TInput> build(IStreamWriter<TInput> output) {
		Distinct<TInput> result = new Distinct<TInput>();
		this.connector.connect(result, output);
		return result;
	}

}
