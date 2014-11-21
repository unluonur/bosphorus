package org.bosphorus.topology.builder;

import org.bosphorus.stream.pipe.IPipe;

public interface IStreamBuilder<TInput, TOutput> {
	
	IPipe<TInput> build(IPipe<TOutput> output);
	
}
