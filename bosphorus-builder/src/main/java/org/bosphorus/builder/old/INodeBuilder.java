package org.bosphorus.builder.old;

import org.bosphorus.pipe.IPipe;

public interface INodeBuilder<TInput, TOutput> {
	IPipe<TInput> build(IPipe<TOutput> output);
}
