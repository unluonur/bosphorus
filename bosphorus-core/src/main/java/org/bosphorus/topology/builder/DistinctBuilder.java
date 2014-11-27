package org.bosphorus.topology.builder;

import java.util.List;

import org.bosphorus.expression.aggregate.executor.list.SelectDistinctExecutor;
import org.bosphorus.stream.batch.BatchStream;
import org.bosphorus.stream.pipe.IPipe;

public class DistinctBuilder<TInput extends Comparable<TInput>> implements IStreamBuilder<TInput, TInput> {
	private IConnector<TInput> connector;

	@Override
	public IPipe<TInput> build(IPipe<TInput> output) {
		BatchStream<TInput, List<TInput>> result = new BatchStream<TInput, List<TInput>>(new SelectDistinctExecutor<TInput>());
		this.connector.connect(result, output);
		return result;
	}

}
