package org.bosphorus.topology.builder;

import org.bosphorus.pipe.Distinct;
import org.bosphorus.pipe.IPipe;

public class DistinctBuilder<TInput> implements IStreamBuilder<TInput, TInput> {
	private IConnector<TInput> connector;

	@Override
	public IPipe<TInput> build(IPipe<TInput> output) {
		Distinct<TInput> result = new Distinct<TInput>();
		this.connector.connect(result, output);
		return result;
	}

}
