package org.bosphorus.topology.node.builder;

import java.util.List;

import org.bosphorus.stream.pipe.IPipe;

public interface IReadWriteNodeBuilder<TInput, TOutput> {
	List<IPipe<TInput>> build(List<IPipe<TOutput>> outputs);
}
