package org.bosphorus.topology.node.builder;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IReadWriteNodeBuilder<TInput, TOutput> {
	List<IWriter<TInput>> build(List<IWriter<TOutput>> outputs);
}
