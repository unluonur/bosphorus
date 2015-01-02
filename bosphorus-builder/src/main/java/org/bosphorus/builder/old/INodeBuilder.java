package org.bosphorus.builder.old;

import org.bosphorus.stream.IPipeExecutor;

public interface INodeBuilder<TInput, TOutput> {
	IPipeExecutor<TInput> build(IPipeExecutor<TOutput> output);
}
