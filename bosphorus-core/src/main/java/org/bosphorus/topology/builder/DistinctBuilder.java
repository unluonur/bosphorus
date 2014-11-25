package org.bosphorus.topology.builder;

import org.bosphorus.stream.batch.SelectDistinct;
import org.bosphorus.stream.pipe.IPipe;

public class DistinctBuilder<TInput> implements IStreamBuilder<TInput, TInput> {
	private IConnector<TInput> connector;

	@Override
	public IPipe<TInput> build(IPipe<TInput> output) {
		SelectDistinct<TInput> result = new SelectDistinct<TInput>();
		this.connector.connect(result, output);
		return result;
	}

}
