package org.bosphorus.topology.node.builder;

import java.util.List;

import org.bosphorus.stream.IWriter;

public interface IReadOnlyNodeBuilder<TOutput> {
	void build(List<IWriter<TOutput>> outputs);
}
